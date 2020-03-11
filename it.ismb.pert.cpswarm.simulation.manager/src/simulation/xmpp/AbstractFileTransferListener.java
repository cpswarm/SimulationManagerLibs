package simulation.xmpp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Set;
import org.apache.commons.lang.StringUtils;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.chat2.Chat;
import org.jivesoftware.smack.chat2.ChatManager;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smackx.filetransfer.FileTransferListener;
import org.jivesoftware.smackx.filetransfer.FileTransferRequest;
import org.jivesoftware.smackx.filetransfer.IncomingFileTransfer;
import org.jivesoftware.smackx.filetransfer.FileTransfer.Status;
import com.google.common.base.Strings;
import com.google.gson.Gson;
import eu.cpswarm.optimization.messages.MessageSerializer;
import eu.cpswarm.optimization.messages.SimulatorConfiguredMessage;
import eu.cpswarm.optimization.statuses.SimulationManagerStatus;
import simulation.SimulationManager;

public abstract class AbstractFileTransferListener implements FileTransferListener {

	protected SimulationManager parent = null;
	protected String dataFolder = null;
	protected String rosFolder = null;
	protected String packageName = null;

	public void setSimulationManager(final SimulationManager manager) {
		assert manager != null;
		this.parent = manager;
		this.dataFolder = parent.getDataFolder();
		this.rosFolder = parent.getRosFolder();
	}

	@Override
	public void fileTransferRequest(FileTransferRequest request) {
		final IncomingFileTransfer transfer = request.accept();

		String fileToReceive = null;
		// The configuration files are stored in the simulator folder, instead the
		// candidate in the rosFolder
		if (request.getRequestor().compareTo(parent.getOrchestratorJID()) == 0) {
			fileToReceive = dataFolder + request.getFileName();
		} else {
			fileToReceive = rosFolder + request.getFileName();
		}
		try {
			transfer.receiveFile(new File(fileToReceive));

			while (!transfer.isDone()) {
				if (transfer.getStatus() == Status.refused) {
					System.out.println("Transfer refused");
				}
				Thread.sleep(1000);
			}
			if(SimulationManager.CURRENT_VERBOSITY_LEVEL.equals(SimulationManager.VERBOSITY_LEVELS.ALL)) {
				System.out.println("File received");
			}
			Thread.sleep(1000);
			// If it's the configuration from the Simulation Orchestrator
			if (request.getRequestor().compareTo(parent.getOrchestratorJID()) == 0) {
				final ChatManager chatmanager = ChatManager.getInstanceFor(parent.getConnection());
				final Chat newChat = chatmanager.chatWith(parent.getOrchestratorJID().asEntityBareJidIfPossible());
				if(SimulationManager.CURRENT_VERBOSITY_LEVEL.equals(SimulationManager.VERBOSITY_LEVELS.ALL)) {
					System.out.println("Received description from the file transfer: "+request.getDescription());
				}
				String otherSimulationConfiguration = request.getDescription();  // Format is: SCID,gui:=true,....
				String[] simConfigs = otherSimulationConfiguration.split(",");
				this.parent.setSCID(simConfigs[0]);
				packageName = simConfigs[0];
				StringBuilder parameters = new StringBuilder();
				for(int i=1; i<simConfigs.length; i++) {
					parameters.append(simConfigs[i]+",");
				}	
				if(parameters.length()!=0) {
					String launchArgs = parameters.substring(0, parameters.length()-1);  // remove the last ,
					this.parent.setSimulationConfiguration(launchArgs);	
					launchArgs = null;
				}
				parameters = null;
				
				if (unzipFiles(fileToReceive)) {
					if(SimulationManager.CURRENT_VERBOSITY_LEVEL.equals(SimulationManager.VERBOSITY_LEVELS.ALL)) {
						System.out.println("SimulationManager configured for optimization "+parent.getSCID());
					}
					parent.sendPresence();
					SimulatorConfiguredMessage reply = new SimulatorConfiguredMessage(this.parent.getOptimizationID(), true);
					MessageSerializer serializer = new MessageSerializer();
					newChat.send(serializer.toJson(reply));
				} else {
					System.out.println("Error unzipping the file, sending error to SOO");
					SimulatorConfiguredMessage reply = new SimulatorConfiguredMessage(this.parent.getOptimizationID(), false);
					MessageSerializer serializer = new MessageSerializer();
					newChat.send(serializer.toJson(reply));
				}
			}
		} catch (final SmackException | IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	private FileTypesOrFolderFilter filter = null;

	protected void copy(final Set<String> supportedException, String fromPath, String outputPath) {
		filter = new FileTypesOrFolderFilter(supportedException);
		File currentFolder = new File(fromPath);
		File outputFolder = new File(outputPath);
		scanFolder(supportedException, currentFolder, outputFolder);
	}

	private void scanFolder(final Set<String> supportedException, File currentFolder, File outputFolder) {
		if(SimulationManager.CURRENT_VERBOSITY_LEVEL.equals(SimulationManager.VERBOSITY_LEVELS.ALL)) {
    		System.out.println("Scanning folder [" + currentFolder + "]...");
    	}
		File[] files = currentFolder.listFiles(filter);
		for (File file : files) {
			if (file.isDirectory()) {
				scanFolder(supportedException, file, outputFolder);
			} else {
				copy(file, outputFolder);
			}
		}
	}

	private void copy(File file, File outputFolder) {
		try {
			if(SimulationManager.CURRENT_VERBOSITY_LEVEL.equals(SimulationManager.VERBOSITY_LEVELS.ALL)) {
        		System.out.println("\tCopying [" + file + "] to folder [" + outputFolder + "]...");
        	}
			InputStream input = new FileInputStream(file);
			OutputStream out = new FileOutputStream(new File(outputFolder + File.separator + file.getName()));
			byte data[] = new byte[input.available()];
			input.read(data);
			out.write(data);
			out.flush();
			out.close();
			input.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected abstract boolean unzipFiles(final String fileToReceive);
}
