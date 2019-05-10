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
package be.iminds.iot.simulator.gazebo;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;
import org.ros.namespace.GraphName;
import org.ros.node.AbstractNodeMain;
import org.ros.node.ConnectedNode;
import org.ros.node.Node;
import org.ros.node.NodeMain;

import be.iminds.iot.simulator.api.Simulator;

/**
 * Check and connect to external Gazebo via ROS.
 * 
 * @author tverbele
 *
 */
@Component(service = {NodeMain.class})
public class GazeboActivator extends AbstractNodeMain{

	private BundleContext context;
	private ServiceRegistration<Simulator> reg;
	
	// in case we need to launch Gazebo ourselves
	private ConfigurationAdmin ca;
	private boolean launchNative = false;
	private Configuration nativeConfig;
	
	private volatile boolean active = false;
	
	@Activate
	void activate(BundleContext context, Map<String, Object> config){
		this.context = context;
		String launch = context.getProperty("gazebo.launch");
		System.out.println("launch = "+ launch);
		if(launch != null){
			launchNative = Boolean.parseBoolean(launch);
		}
	}
	
	@Deactivate
	void deactivate(){
		active = false;
		if(nativeConfig !=null){
			try {
				nativeConfig.delete();
			} catch (IOException e) {
			}
		}
	}
	
	@Override
	public GraphName getDefaultNodeName() {
		return GraphName.of("gazebo/activator");
	}
	
	@Override
	public void onStart(ConnectedNode connectedNode){
		active = true;
		while(reg == null && active){
			try {
				Gazebo gazebo = new Gazebo(connectedNode);
				System.out.println("\n create Gazebo instance");

				Hashtable<String, Object> properties = new Hashtable<String, Object>();
				properties.put("osgi.command.scope", "gazebo");
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
				System.out.println("\n add Gazebo commands into Felix GoGo console!");
				reg = context.registerService(Simulator.class, gazebo, properties);
				
			} catch(Exception e){
			/*	if(nativeConfig == null && launchNative){
					System.out.println("\n  try to load gazebo ourselves");
					// try to load gazebo ourselves?					
					try {				
						nativeConfig = ca.createFactoryConfiguration("be.iminds.iot.simulator.gazebo.Native", null);					
						nativeConfig.update(new Hashtable());
					} catch(Exception ex){}
				}
			*/
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e1) {
					e1.printStackTrace();
				}
			}
		}
		if(reg == null){
			System.out.println("\n Failed to connect to Gazebo!");
		}
	}
	
	@Override
	public void onShutdown(Node node) {
		if(reg != null){
			reg.unregister();
		}
	}
	
	@Reference
	void setConfigurationAdmin(ConfigurationAdmin ca){
		this.ca = ca;
	}
}
