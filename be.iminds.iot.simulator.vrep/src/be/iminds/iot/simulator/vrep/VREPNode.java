package be.iminds.iot.simulator.vrep;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ConfigurationPolicy;
import org.osgi.service.component.annotations.Deactivate;

import be.iminds.iot.ros.util.NativeRosNode;
import be.iminds.iot.ros.util.NativeRosNode.VERBOSITY_LEVELS;

@Component(immediate = true,
	name = "be.iminds.iot.simulator.vrep.Native",
	configurationPolicy = ConfigurationPolicy.REQUIRE)
public class VREPNode {
	private boolean headless = false;
	private boolean log = false;
	private boolean quit = false;
	private int port = 19997;
	private String rosMasterURI = null;
	private String vrepDir = null;
	private Process process;
	private int timeout = 90000;

	@Activate
	protected void activate(BundleContext context, Map<String, Object> properties) throws Exception {
		for (Entry<String, Object> entry : properties.entrySet()) {
			String key = entry.getKey();
			// specific ros properties
			if (key.equals("ros.master.uri")) {
				rosMasterURI = (String) entry.getValue();
			} else if (key.equals("vrep.dir")) {
				vrepDir = (String) entry.getValue();
			} else if (key.equals("vrep.headless")) {
				headless = (boolean) entry.getValue();
			} else if (key.equals("vrep.port")) {
				port = (int) entry.getValue();
			} else if (key.equals("vrep.log")) {
				log = (boolean) entry.getValue();
			} else if (key.equals("vrep.quit")) {
				quit = (boolean) entry.getValue();
			} else if (key.equals("vrep.timeout")) {
				timeout = (int) entry.getValue();
			} 
		}

		try {
			// add vrep dir to LD_LIBRARY_PATH and start vrep executable
			// vrep -h -s90000 -q myScene.ttt
			File file = new File(vrepDir);
<<<<<<< HEAD
			ProcessBuilder builder = new ProcessBuilder("source ~/.bashrc; "+file.getAbsolutePath() + File.separator + "vrep",
					headless ? "-h" : "", quit ? "-q" : "", port != 19997 ? "-gREMOTEAPISERVERSERVICE_" + port + "_FALSE_TRUE" : "");
			builder.environment().put("LD_LIBRARY_PATH",
					builder.environment().get("LD_LIBRARY_PATH") + ":" + file.getAbsolutePath());
			System.err.println("LD_LIBRARY_PATH = "+builder.environment().get("LD_LIBRARY_PATH"));
=======
			ProcessBuilder builder = new ProcessBuilder(file.getAbsolutePath() + File.separator + "vrep",
					headless ? "-h" : "", quit ? "-q" : "", port != 19997 ? "-gREMOTEAPISERVERSERVICE_" + port + "_FALSE_TRUE" : "");
			builder.environment().put("LD_LIBRARY_PATH",
					builder.environment().get("LD_LIBRARY_PATH") + ":" + file.getAbsolutePath());

>>>>>>> refs/remotes/origin/api2.0
			if (rosMasterURI != null) {
				builder.environment().put("ROS_MASTER_URI", rosMasterURI.toString());
			}
			if (log)
				builder.inheritIO();
			process = builder.start();

		} catch (Exception ex) {
			System.err.println("Error launching VREP ");
			throw ex;
		}
	}

	@Deactivate
	protected void deactivate() {
		System.out.println("VREP is deactivated in VREPNode class");
		try {  // commont this if SM has a common used vrep node, instead using launcher to new one instance for each simulation
			Process process = Runtime.getRuntime().exec("killall -9 "+vrepDir+"vrep");
			process.waitFor();
			process.destroy();
			process = null;
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
