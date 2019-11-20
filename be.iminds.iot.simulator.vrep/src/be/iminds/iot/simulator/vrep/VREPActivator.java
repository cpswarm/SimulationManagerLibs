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
package be.iminds.iot.simulator.vrep;

import java.io.File;
import java.io.IOException;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Properties;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

import be.iminds.iot.simulator.api.Simulator;
import coppelia.remoteApi;

/**
 * Check and connect to external VREP process and keep heartbeat once connected.
 * 
 * @author tverbele
 *
 */
@Component(immediate=true)
public class VREPActivator {
	
	private remoteApi server;
	private int clientID = -1;

	private VREP vrep;
	private ServiceRegistration<Simulator> reg;

	private boolean launchNative = false;
	private boolean headless = false;
	private boolean log = false;
	private boolean quit = false;  // automatically quits V-REP after the first simulation run ended
	private String vrepDir = null;
	private String scene;
	
	private ConfigurationAdmin ca;
	private BundleContext context;
	private Configuration nativeConfig;
	
	private volatile boolean heartbeat = false;
	private int interval = 10000;
	private int port = 19997;
	private String rosMasterURI = null;
	private int timeout = 90000;
	
	@Activate
	void activate(BundleContext context) throws Exception {
		this.context = context;
		
		String launch = context.getProperty("vrep.launch");
		if(launch != null){
			launchNative = Boolean.parseBoolean(launch);
		}
		
		String r = context.getProperty("ros.master.uri");
		if(r!=null){
			rosMasterURI = context.getProperty("ros.master.uri");
		}
		
		String i = context.getProperty("vrep.interval");
		if(i!=null){
			interval = Integer.parseInt(i);
		}
		
		String d = context.getProperty("vrep.dir");
		if(d!=null){
			vrepDir = d;
		}
		if (!vrepDir.endsWith(File.separator)) {
			vrepDir += File.separator;
		}
		
		String h = context.getProperty("vrep.headless");
		if(h!=null){
			headless = Boolean.parseBoolean(h);
		}
		
		String q = context.getProperty("vrep.quit");
		if(q!=null){
			quit = Boolean.parseBoolean(q);
		}
		
		String p = context.getProperty("vrep.port");
		if(p!=null){
			port = Integer.parseInt(p);
		}
		
		String t = context.getProperty("vrep.timeout");
		if(t!=null){
			timeout = Integer.parseInt(t);
		}
	
		String lg = context.getProperty("vrep.log");
		if(lg!=null){
			log = Boolean.parseBoolean(lg);
		}
		
		scene = context.getProperty("vrep.scene");
		
		
		this.server = new remoteApi();  //  load the coppelia library
		this.server.simxFinish(-1); // just in case, close all opened connections

		this.heartbeat = true;
		
		new Thread(() ->{
			while(heartbeat){
				connect();
				
				try {
					Thread.sleep(interval);
				} catch (Exception e) {
				}
			}
		}).start();
		
	}
	
	void connect() {
		if (clientID != -1) {
			// check if still connected
			int ret = server.simxGetConnectionId(clientID);
			if (ret != -1) {
				// already connected
				return;
			} else {
				// connection lost - tear down
				tearDown();
			}
		}

		// try to connect to an already running VREP
		clientID = server.simxStart("127.0.0.1", port, true, true, -timeout, 5);
		if (clientID == -1) {
			if (nativeConfig == null && launchNative) {
				try {
					nativeConfig = ca.createFactoryConfiguration("be.iminds.iot.simulator.vrep.Native", null);
					Properties props = new Properties();
					props.put("ros.master.uri", rosMasterURI);
					props.put("vrep.dir", vrepDir);
					props.put("vrep.headless", headless);
					props.put("vrep.port", port);
					props.put("vrep.log", log);
					props.put("vrep.quit", quit);
					props.put("vrep.timeout", timeout);
					nativeConfig.update((Dictionary) props);
				} catch (Exception ex) {
					ex.printStackTrace();
				}
			}
			clientID = server.simxStart("127.0.0.1", port, true, true, -timeout, 5);
			while (clientID == -1) {
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
				clientID = server.simxStart("127.0.0.1", port, true, true, -timeout, 5); // To enable the remote API on
			}
		}

		if (clientID != -1) {
			init();
		}
	}
	
	void init(){
		try {
			vrep = new VREP(server, ca);
		}catch(Exception e) {
			e.printStackTrace();
		}

		Hashtable<String, Object> properties = new Hashtable<String, Object>();
		properties.put("osgi.command.scope", "vrep");
		properties.put("osgi.command.function", new String[]{
				"start",
				"pause",
				"stop",
				"tick",
				"loadScene",
				"getPosition",
				"setPosition",
				"getOrientation",
				"setOrientation",
				"checkCollisions"		
		});
		System.out.println("\n add Vrep commands into Felix GoGo console!");
		reg = context.registerService(Simulator.class, vrep, properties);
	
		if(nativeConfig != null && scene != null){
			vrep.loadScene(scene, null);
		}/* else {
			vrep.loadHandles();
		}*/
	}
	
	@Deactivate
	void deactivate(){
		this.heartbeat = false;
		tearDown();
	}
	
	void tearDown(){	
		if(reg != null){
			reg.unregister();
		}		
		vrep.deconfigure();		
		this.server.simxFinish(-1);
		if(nativeConfig !=null){
			try {
				nativeConfig.delete();
			} catch (IOException e) {
			}
		}
		try {
			Process process = Runtime.getRuntime().exec("/bin/bash killall -9 "+vrepDir+"vrep");
			Runtime.getRuntime().addShutdownHook(new Thread(process::destroy));
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
	
	@Reference
	void setConfigurationAdmin(ConfigurationAdmin ca){
		this.ca = ca;
	}
}
