/*******************************************************************************
 *  ROSOSGi - Bridging the gap between Robot Operating System (ROS) and OSGi
 *  Copyright (C) 2015, 2017  imec - IDLab - UGent
 *
 *  This file is part of DIANNE  -  Framework for distributed artificial neural networks
 *
 *  DIANNE is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Affero General Public License as
 *  published by the Free Software Foundation, either version 3 of the
 *  License, or (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Affero General Public License for more details.
 *   
 *  You should have received a copy of the GNU Affero General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *   
 *  Contributors:
 *      Tim Verbelen, Steven Bohez
 *******************************************************************************/
package be.iminds.iot.ros.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import be.iminds.iot.ros.api.Ros;

public class NativeRosNode {

	protected Process process;

	protected String name;
	protected String rosPackage;
	protected String rosNode;
	protected String rosWorkspace;
	protected String cmakeBuildType;
	protected boolean startNow = false;
	protected List<String> rosParameters = new ArrayList<>();
	public static enum VERBOSITY_LEVELS {
		NO_DEBUG,
		ONLY_ERROR,
		ALL;
	};
	
	public static VERBOSITY_LEVELS CURRENT_VERBOSITY_LEVEL = VERBOSITY_LEVELS.ALL;
	
	public NativeRosNode() {
	}

	public NativeRosNode(String pkg, String node) {
		this.rosPackage = pkg;
		this.rosNode = node;
	}

	public NativeRosNode(String pkg, String node, String... parameters) {
		this.rosPackage = pkg;
		this.rosNode = node;
		for (String parameter : parameters) {
			System.out.println("************************* parameter: " + parameter);
			if (!parameter.contains(":=") && !parameter.contains(".world")) {
				System.out.println("Invalid parameter: " + parameter);
				continue;
			} else {
				// in case the parameter is a world file, then specify its path
				rosParameters.add(parameter);
			}
		}
	}

	@Activate
	protected void activate(BundleContext context, Map<String, Object> properties) throws Exception {
		String verbosity = "2";
		if(context.getProperty("verbosity")!=null){
			verbosity = context.getProperty("verbosity");
		}
		int verbosityI = Integer.parseInt(verbosity);
		if(verbosityI>2) {
			System.out.println("Invalid verbosity level, using the default one: ALL");
		} else {
			CURRENT_VERBOSITY_LEVEL = VERBOSITY_LEVELS.values()[verbosityI];
		}
		
		// this also allows to build a ROS node driven by configuration
		if (properties.containsKey("ros.buildWorkspace")) {
			rosWorkspace = (String) properties.get("ros.buildWorkspace");
			if (properties.containsKey("cmakeBuild.type")) {
				cmakeBuildType = (String) properties.get("cmakeBuild.type");
			}
		} else {
			for (Entry<String, Object> entry : properties.entrySet()) {
				String key = entry.getKey();
				// specific ros properties
				if (key.equals("rosWorkspace")) {
					rosWorkspace = (String) entry.getValue();
				} else if (key.equals("ros.package")) {
					rosPackage = (String) entry.getValue();
				} else if (key.equals("ros.node")) {
					rosNode = (String) entry.getValue();
				} else if (key.equals("ros.mappings")) {
					String extraMappings = (String) entry.getValue();
					if (extraMappings != null) {
						String[] mappings = extraMappings.split(",");
						for (String mapping : mappings) {
							rosParameters.add(mapping);
						}
					}
				} else if (key.equals("name")) {
					name = entry.getValue().toString();
					rosParameters.add("name:=" + name);
				} else if (key.equals("worldFile.path")) {
					String worldFile = entry.getValue().toString();
					rosParameters.add(worldFile);
				} else if (!key.contains(".")) { // ignore parameters with "." , most likely OSGi service props
					rosParameters.add(key + ":=" + entry.getValue());
				}
			}
		}
		if(startNow) {  // use this flag to specify starting the simulation automatically or explicitly calling to this method
			startSimulation();
		}
	}

	public void startSimulation() {
		boolean roslaunch = false;
		if (rosNode.endsWith(".launch")) {
			roslaunch = true;
		}
		try {		
			List<String> cmd = new ArrayList<>();
			cmd.add("/bin/bash");
			cmd.add("-c");
			StringBuilder source = new StringBuilder();
			if(rosWorkspace == null)
				source.append("source /opt/ros/kinetic/setup.bash ; ");
			else
				source.append("source /opt/ros/kinetic/setup.bash ; source " + rosWorkspace + "devel/setup.bash ; source ~/.bashrc; ");				
			if (roslaunch) {
				source.append("roslaunch ");
			} else {
				source.append("rosrun ");
			}
			source.append(rosPackage + " " + rosNode);

			// use name for setting the node name
			if (name != null) {
				source.append(" __name:=" + name);
			}
			// add params to command
			for (String str : rosParameters) {
				source.append(" " + str);
			}

			cmd.add(source.toString());
			if(CURRENT_VERBOSITY_LEVEL.equals(VERBOSITY_LEVELS.ALL)) {
				System.out.println("\n=================running command = " + cmd + " ==================\n");
			}
			ProcessBuilder builder = new ProcessBuilder(cmd);
			if(CURRENT_VERBOSITY_LEVEL.equals(VERBOSITY_LEVELS.ALL)) {
				builder.inheritIO();
				process = builder.start();
				process.waitFor();
				process = null;
				
			}else {
				process = builder.start();
				String line=null;
				BufferedReader input =  
						new BufferedReader  
						(new InputStreamReader(process.getInputStream()));  
				while ((line = input.readLine()) != null) {  // to be sure that GUI=true works, process InputStream must be read
					line = null;
				}
				process.waitFor();
				process = null;
				input.close();
				input = null;
				line = null;
			}
				System.out.println("Ros command exits");
		} catch (Exception e) {
			System.err.println("Error launching native ros node " + rosPackage + " " + rosNode);
			e.printStackTrace();
		}
	}

	public void buildWorkspace() throws Exception {
		assert (rosWorkspace) != null;
		ProcessBuilder builder = null;
		try {
			String[] cmd = null;
			if(this.cmakeBuildType == null) {
				cmd = new String[] { "/bin/bash", "-c", "source /opt/ros/kinetic/setup.bash; cd " + rosWorkspace + " ; catkin build " };
			}else {
				cmd = new String[] { "/bin/bash", "-c", "source /opt/ros/kinetic/setup.bash; cd " + rosWorkspace + " ; catkin build --cmake-args -DCMAKE_BUILD_TYPE="+ cmakeBuildType};
			}
			builder = new ProcessBuilder(cmd);
			builder.inheritIO();
			process = builder.start();
			process.waitFor();
			if(CURRENT_VERBOSITY_LEVEL.equals(VERBOSITY_LEVELS.ALL)) {
				System.out.println("build workspace finished");
			}
		} catch (Exception e) {
			throw e;
		} finally {
			builder = null;
		}
	}

	@Deactivate
	protected void deactivate() {
		System.out.println("rosComand is deactivated");
		Process proc;
		try {
			ProcessBuilder builder = new ProcessBuilder(new String[] { "/bin/bash", "-c", "killall -2 roslaunch"});
			builder.inheritIO();
			proc = builder.start();
			proc.waitFor();
			proc = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		try {
			Thread.sleep(25000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		int counter = 2;
		while (process != null && counter>0) {
			try {
				Thread.sleep(15000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			counter-=1;	
		}	
		if (process != null) {
			process.destroyForcibly();			
			try {
				process.waitFor();
				System.out.println("process destroyForcibly in deactivate()");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			process = null;
		}
	}

/*	@Reference
	void setROSEnvironment(Ros e) {
		// make sure ROS core is running before activating a native node
	}*/

}
