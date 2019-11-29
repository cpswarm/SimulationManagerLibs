package simulation.xmpp;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.jivesoftware.smack.chat2.IncomingChatMessageListener;
import org.jivesoftware.smack.packet.Message;
import org.jxmpp.jid.EntityBareJid;

import eu.cpswarm.optimization.messages.MessageSerializer;
import eu.cpswarm.optimization.messages.ParameterSet;
import eu.cpswarm.optimization.messages.RunSimulationMessage;
import simulation.SimulationManager;

/**
 *
 * The abstract class to be used by the simulation managers to receive the
 * candidates via chat messages
 *
 */
public abstract class AbstractMessageEventCoordinator implements IncomingChatMessageListener {

	private SimulationManager parent;
	protected static final Double BAD_FITNESS = 0.0;
	protected String packageName = null;
	
	public void setSimulationManager(final SimulationManager manager) {
		assert (parent) != null;
		this.parent = manager;
	}

	@Override
	public void newIncomingMessage(EntityBareJid sender, Message msg, org.jivesoftware.smack.chat2.Chat chat) {
		MessageSerializer serializer = new MessageSerializer();
		RunSimulationMessage runSimulation = serializer.fromJson(msg.getBody());
		System.out.println("parameterSet = "+msg.getBody());
		if(SimulationManager.CURRENT_VERBOSITY_LEVEL.equals(SimulationManager.VERBOSITY_LEVELS.ALL)) {
			System.out.println("SimulationManager received RunSimulationMessage from "+sender.asBareJid());
		}
		parent.setOptimizationID(runSimulation.getId());
		parent.setSimulationID(runSimulation.getSid());
		parent.setSimulationConfiguration(runSimulation.getConfiguration());
		// The candidate is handled in different ways by the several simulators
		this.handleCandidate(sender, runSimulation.getParameterSet());
	}

	/**
	 * Method to analysis the received Json data from orchestrator or optimization tool, then put each optimization parameter in correct place based on the meatdata(config file or command line) added to the parameter. This is used for parameter optimization
	 * 
	 * @return the result of the serialization (true: OK, false error)
	 */
	protected boolean serializeCandidate(final String candidate) {
		String metaType = "command line";
		String metaPackage = "swarm_behaviors";
		boolean findLine = false;
		StringBuilder simConfig = new StringBuilder();  // visual:true, name:=value, ....
		
		String[] names = {"1", "2"};
		double[] values = {0.1, 0.2};
		
		for (int i = 0; i < names.length-1; i++) {
			
			if (metaType.equals("command line")) {
				simConfig.append(names[i] + ":=" + values[i] + ",");
			} else if (metaType.equals("file")) {
				String metaPackageName = getMetaPackage();
				Process proc = null;
				try {
					proc = Runtime.getRuntime().exec(new String[] { "/bin/bash", "-c",
							"source " + parent.getCatkinWS() + "devel/setup.bash ; rospack find " + metaPackageName });

					Runtime.getRuntime().addShutdownHook(new Thread(proc::destroy));
					String line = "";
					BufferedReader input = new BufferedReader(new InputStreamReader(proc.getInputStream()));

					if ((line = input.readLine()) != null && !line.startsWith("[rospack]")) {
						String parameterFilePath = line + "/param/ugv_random_walk.yaml";
						File parameterFile = new File(parameterFilePath);
						if (parameterFile.exists()) {
							List<String> fileContent = new ArrayList<>(
									Files.readAllLines(Paths.get(parameterFilePath), StandardCharsets.UTF_8)); // ensure the file is closed in all cases
							findLine = false;
							for (int j = 0; j < fileContent.size(); j++) {
								if (fileContent.get(j).trim().startsWith(names[i])) {
									fileContent.set(j, names[i] + " " + values[i]);
									findLine = true;
									break;
								}
							}
						/*	if(!findLine) // if the doesn't exist, append one more line at the end of the file
								fileContent.add(names[i] + " " + values[i]);						
							Files.write(Paths.get(parameterFilePath), fileContent, StandardCharsets.UTF_8);*/
							
							if(findLine) {
								Files.write(Paths.get(parameterFilePath), fileContent, StandardCharsets.UTF_8);
							} else {  // if the line doesn't exist, report error and stop simulation
								System.out.println("Error: the parameter doesn't exist in the yaml file");
								return false;
							}
							
						} else {
							System.out.println("Error: the parameter file doesn't exist in the package " + metaPackageName);
							return false;
						}

					} else {
						System.out.println("Error: the parameter package " + metaPackageName +"doesn't exist");
						return false;
					}
				} catch (IOException e) {
					e.printStackTrace();
					return false;
				}
			}
		}
		
		if(simConfig.length()!=0) {
			String commandLine = simConfig.substring(0, simConfig.length()-1);  // remove the last ,
			parent.setSimulationConfiguration(commandLine);
		}
		
		return true;
	}
	
	public String getName() {
		return "name";
	}
	public String getValue() {
		return "0.1";
	}
	public String getMetaType() {
		return "command line"; // or file
	}
	public String getMetaPackage() {
		return "metaPackage";
	}

	/**
	 * Method to be implemented with the handler for the candidate
	 * 
	 * @param sender
	 * 
	 * @param candidate:
	 *            the candidate to be evaluated
	 */
	protected abstract void handleCandidate(EntityBareJid sender, final ParameterSet parameterSet);
}
