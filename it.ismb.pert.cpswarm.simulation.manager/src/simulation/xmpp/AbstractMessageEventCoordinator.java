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
import java.util.SplittableRandom;

import org.jivesoftware.smack.chat2.IncomingChatMessageListener;
import org.jivesoftware.smack.packet.Message;
import org.jxmpp.jid.EntityBareJid;
import org.jxmpp.jid.impl.JidCreate;
import org.jxmpp.stringprep.XmppStringprepException;

import eu.cpswarm.optimization.messages.MessageSerializer;
import eu.cpswarm.optimization.messages.RunSimulationMessage;
import eu.cpswarm.optimization.parameters.Parameter;
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
	protected StringBuilder params = new StringBuilder();

	public void setSimulationManager(final SimulationManager manager) {
		assert (parent) != null;
		this.parent = manager;
	}

	@Override
	public void newIncomingMessage(EntityBareJid sender, Message msg, org.jivesoftware.smack.chat2.Chat chat) {
		MessageSerializer serializer = new MessageSerializer();
		RunSimulationMessage runSimulation = serializer.fromJson(msg.getBody());
		if (parent.getOptimizationID() == null 
				|| (parent.getOptimizationID() != null && parent.getOptimizationID().equals(runSimulation.getOptimizationId()))) {
			if (SimulationManager.CURRENT_VERBOSITY_LEVEL.equals(SimulationManager.VERBOSITY_LEVELS.ALL)) {
				System.out.println("SimulationManager received RunSimulationMessage from " + sender.asBareJid());
			}
			parent.setOptimizationID(runSimulation.getOptimizationId());
			parent.setSimulationID(runSimulation.getSimulationId());
			parent.setSimulationSeed((int) runSimulation.getSimulationSeed());
			this.handleCandidate(sender, runSimulation.getParameters());
			runSimulation = null;
		} else {
			System.out.println("SimulationManager received a RunSimulation Message from unknown sender");
		}
	}

	/**
	 * Method to analysis the received Json data from orchestrator or optimization tool, then put each optimization parameter in correct place based on the meatdata(config file or command line) added to the parameter.
	 * This is used for parameter optimization
	 * @return the result of the serialization (true: OK, false error)
	 */
	protected boolean serializeCandidate(final List<Parameter> parameters) {
		float stepsize = 0;
		boolean findLine = false;
		StringBuilder simConfig = new StringBuilder();  // visual:=true, name:=value, ....
		String parameterFilePath = null;
		File parameterFile = null;
		if (params.length()!=0)
			params.delete(0, params.length());
		for (Parameter param : parameters) {
			if (param.getMeta().equals("command_line")) {
				Float fl = new Float(param.getValue());
				simConfig.append(param.getName() + ":=" + fl.intValue() + ",");	
				if (params.length()==0) {
					params.append(param.getName() + ":" + fl.intValue());
				} else {
					params.append(","+param.getName() + ":" + fl.intValue());
				}
			} else if (param.getMeta().split(":")[0].equals("file")) {
				String metaPackageName = param.getMeta().split(":")[1]; //"ugv_random_walk"
				stepsize = param.getValue();
				Process proc = null;
				try {
					proc = Runtime.getRuntime().exec(new String[] { "/bin/bash", "-c",
							"source " + parent.getCatkinWS() + "devel/setup.bash ; rospack find " + metaPackageName });
					String line = null;
					BufferedReader input = new BufferedReader(new InputStreamReader(proc.getInputStream()));

					if ((line = input.readLine()) != null && !line.startsWith("[rospack]")) {
						proc.waitFor();
						proc = null;
						input.close();
						input = null;
						parameterFilePath = line + "/param/"+metaPackageName+".yaml";
						metaPackageName = null;
						parameterFile = new File(parameterFilePath);
						if (parameterFile.exists()) {
							List<String> fileContent = new ArrayList<>(
									Files.readAllLines(Paths.get(parameterFilePath), StandardCharsets.UTF_8)); // ensure the file is closed in all cases
							findLine = false;
							for (int j = 0; j < fileContent.size(); j++) {
								if (fileContent.get(j).trim().startsWith(param.getName())) {
									fileContent.set(j, param.getName() + ": " + param.getValue());
									if (params.length()==0) {
										params.append(param.getName() + ":" + param.getValue());
									} else {
										params.append(","+param.getName() + ":" + param.getValue());
									}
									findLine = true;
									break;
								}
							}
							if(findLine) {
								Files.write(Paths.get(parameterFilePath), fileContent, StandardCharsets.UTF_8);								
							} else {  // if the line doesn't exist, report error and stop simulation
								System.out.println("Error: the parameter doesn't exist in the yaml file");
								return false;
							}
							fileContent = null;						
						} else {
							System.out.println("Error: the parameter file doesn't exist in the package " + metaPackageName);
							return false;
						}
						parameterFilePath = null;
						parameterFile = null;
					} else {
						System.out.println("Error: the parameter package " + metaPackageName +"doesn't exist");
						return false;
					}
					line = null;
				} catch (IOException e) {
					e.printStackTrace();
					return false;
				} catch (InterruptedException e) {
					e.printStackTrace();
				} 
			}
			else {
				return false;
			}
		}
		if(simConfig.length()!=0) {
			String commandLine = simConfig.toString()+("rng_seed:="+parent.getSimulationSeed());
			System.out.println("parameter values = step-size:="+stepsize+", "+commandLine);
			String launchArgs = parent.getSimulationConfiguration();
			if (launchArgs != null) {
				launchArgs+=","+commandLine;
				parent.setSimulationConfiguration(launchArgs);
			} else {
				parent.setSimulationConfiguration(commandLine);
			}
			commandLine = null;
			launchArgs = null;
			simConfig = null;
		}
		return true;
	}


	/**
	 * Method to be implemented with the handler for the candidate
	 * 
	 * @param sender
	 * 
	 * @param candidate:
	 *            the candidate to be evaluated
	 */
	protected abstract void handleCandidate(EntityBareJid sender, final List<Parameter> parameters);
}
