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
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.TimeoutException;

import org.osgi.service.cm.Configuration;
import org.osgi.service.cm.ConfigurationAdmin;

import be.iminds.iot.simulator.api.Orientation;
import be.iminds.iot.simulator.api.Position;
import be.iminds.iot.simulator.api.Simulator;
import coppelia.BoolW;
import coppelia.FloatWA;
import coppelia.IntW;
import coppelia.IntWA;
import coppelia.StringWA;
import coppelia.remoteApi;

/**
 * Simulator implementation for the VREP simulator
 * 
 * @author tverbele
 *
 */
public class VREP implements Simulator {
	
	private remoteApi server; 
	private int clientID;
	
	private Map<String, Integer> objectHandles = new HashMap<>();
	private Map<String, String> entities = new HashMap<>();
	
	private List<Configuration> configurations = new ArrayList<>();
	private ConfigurationAdmin ca;
	
	private Map<String, Integer> parameterKeys = new HashMap<>();

	
	public VREP(remoteApi server, ConfigurationAdmin ca){
		this.server = server;
		this.ca = ca;
		
		Field[] declaredFields = remoteApi.class.getDeclaredFields();
		for(Field f : declaredFields){
			if(java.lang.reflect.Modifier.isStatic(f.getModifiers())){
				if(f.getType().isAssignableFrom(Integer.class)){
					try {
						parameterKeys.put(f.getName(), (Integer)(f.get(this.server)));
					} catch(Exception e){}
				}
			}
		}
	}
	
	@Override
	public synchronized void start(boolean sync, float step, Map<String, Object> config) {
		System.out.println("Starting V-REP simulation ");
		checkOk(server.simxSetFloatingParameter(clientID, server.sim_floatparam_simulation_time_step, step, server.simx_opmode_blocking));
		
		if(config != null){
			
			for(Entry<String, Object> e : config.entrySet()){
				if(!parameterKeys.containsKey(e.getKey())){
					System.out.println("Invalid configuration key: "+e.getKey());
					continue;
				}				
				Object v = e.getValue();
				if(v instanceof Integer){
					checkOk(server.simxSetIntegerParameter(clientID, parameterKeys.get(e.getKey()), (Integer)v, server.simx_opmode_blocking));
				} else if(v instanceof Float){
					checkOk(server.simxSetFloatingParameter(clientID, parameterKeys.get(e.getKey()), (Float)v, server.simx_opmode_blocking));
				} else if(v instanceof Boolean){
					checkOk(server.simxSetBooleanParameter(clientID, parameterKeys.get(e.getKey()), (Boolean)v, server.simx_opmode_blocking));
				}
			}
		}
		
		checkOk(server.simxSynchronous(clientID, sync));
		
		checkOk(server.simxStartSimulation(clientID, server.simx_opmode_blocking));
		
	//	configure();
		
	}
	
	void configure(){
		if (entities.size() != 0) {
			try {
				entities.entrySet().stream().forEach(e -> {
					String name = e.getKey();
					String type = e.getValue();

					if (!objectHandles.containsKey(name)) {
						System.out.println("Entitiy " + name + " not existing in the simulator...");
						return;
					}

					Hashtable<String, Object> t = new Hashtable<>();
					t.put("name", name);

					try {
						Configuration c = ca.createFactoryConfiguration(type, null);
						c.update(t);
						configurations.add(c);
					} catch (Exception ex) {
						ex.printStackTrace();
					}
				});
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public synchronized void pause() {
		deconfigure();

		checkOk(server.simxPauseSimulation(clientID, server.simx_opmode_blocking));
	}

	@Override
	public void resume() {
		checkOk(server.simxStartSimulation(clientID, server.simx_opmode_blocking));
		
		configure();
	}
	
	@Override
	public synchronized void stop() {
		deconfigure();

		// stop the simulation:
		checkOk(server.simxStopSimulation(clientID,server.simx_opmode_blocking));
		
	}

	void deconfigure(){
		for(Configuration c : configurations){
			try {
				c.delete();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		configurations.clear();
	}
	
	@Override
	public void tick() throws TimeoutException {
		int ret = server.simxSynchronousTrigger(clientID);
		if(ret == 2){
			// this is something weird that was experienced on OpenStack VMs :-/
			// client should restart the simulator when this happens?
			// TODO teardown the Simulator service?
			throw new RuntimeException("Simulator stalled?!");
		} else if(ret == 3){
			throw new TimeoutException("V-REP timed out!");
		} else {
			checkOk(ret);
		}
	}

	@Override
	public void loadScene(String file, Map<String, String> entities) {
		System.out.println("loading Scene ");
		File f = new File(file);
		if(!f.exists()){
			System.out.println("File "+file+" does not exist...");
			return;
		}
		checkOk(server.simxLoadScene(clientID, f.getAbsolutePath(), 0, server.simx_opmode_blocking));
		if(entities!=null) {
			this.entities = new HashMap<>(entities);
		}
		
	//	loadHandles();
	}

	@Override
	public Position getPosition(String object) {
		return getPosition(object, null);
	}

	@Override
	public void setPosition(String object, Position p) {
		setPosition(object, null, p);
	}

	@Override
	public Position getPosition(String object, String relativeTo) {
		Integer objectHandle = objectHandles.get(object);
		if(objectHandle == null){
			System.out.println("Object "+object+" not found...");
			return null;
		}
		Integer relativeToObjectHandle = objectHandles.get(relativeTo);
		if(relativeToObjectHandle == null){
			relativeToObjectHandle = new Integer(-1);
		}
		
		FloatWA position = new FloatWA(3);
		
		checkOk(server.simxGetObjectPosition(clientID, objectHandle, relativeToObjectHandle, position, server.simx_opmode_blocking));
		
		return new Position(position.getArray()[0], position.getArray()[1], position.getArray()[2]);
	}

	@Override
	public void setPosition(String object, String relativeTo, Position p) {
		Integer objectHandle = objectHandles.get(object);
		if(objectHandle == null){
			System.out.println("Object "+object+" not found...");
			return;
		}
		Integer relativeToObjectHandle = objectHandles.get(relativeTo);
		if(relativeToObjectHandle == null){
			relativeToObjectHandle = new Integer(-1);
		}
		
		FloatWA position = new FloatWA(3);
		position.getArray()[0]= p.x;
		position.getArray()[1]= p.y;
		position.getArray()[2]= p.z;
		
		checkOk(server.simxSetObjectPosition(clientID, objectHandle, relativeToObjectHandle, position, server.simx_opmode_blocking));
	}

	public void setPosition(String object, float x, float y, float z) {
		setPosition(object, new Position(x, y, z));
	}
	
	public void setPosition(String object, String relativeTo, float x, float y, float z) {
		setPosition(object, relativeTo, new Position(x, y, z));
	}
	
	@Override
	public Orientation getOrientation(String object) {
		return getOrientation(object, null);
	}

	@Override
	public void setOrientation(String object, Orientation o) {
		setOrientation(object, null, o);
	}

	@Override
	public Orientation getOrientation(String object, String relativeTo) {
		Integer objectHandle = objectHandles.get(object);
		if(objectHandle == null){
			System.out.println("Object "+object+" not found...");
			return null;
		}
		Integer relativeToObjectHandle = objectHandles.get(relativeTo);
		if(relativeToObjectHandle == null){
			relativeToObjectHandle = new Integer(-1);
		}
		
		FloatWA orientation = new FloatWA(3);
		
		checkOk(server.simxGetObjectOrientation(clientID, objectHandle, relativeToObjectHandle, orientation, server.simx_opmode_blocking));
		
		return new Orientation(orientation.getArray()[0], orientation.getArray()[1], orientation.getArray()[2]);
	}

	@Override
	public void setOrientation(String object, String relativeTo, Orientation o) {
		Integer objectHandle = objectHandles.get(object);
		if(objectHandle == null){
			System.out.println("Object "+object+" not found...");
			return;
		}
		Integer relativeToObjectHandle = objectHandles.get(relativeTo);
		if(relativeToObjectHandle == null){
			relativeToObjectHandle = new Integer(-1);
		}
		
		FloatWA orientation = new FloatWA(3);
		orientation.getArray()[0]= o.alfa;
		orientation.getArray()[1]= o.beta;
		orientation.getArray()[2]= o.gamma;
		
		checkOk(server.simxSetObjectOrientation(clientID, objectHandle, relativeToObjectHandle, orientation, server.simx_opmode_blocking));

	}
	
	public void setOrientation(String object, float a, float b, float g) {
		setOrientation(object, new Orientation(a, b, g));
	}
	
	public void setOrientation(String object, String relativeTo, float a, float b, float g) {
		setOrientation(object, relativeTo, new Orientation(a, b, g));
	}

	@Override
	public void setPose(String object, Position p, Orientation o) {
		setPosition(object, p);
		setOrientation(object, o);
	}

	@Override
	public void setPose(String object, String relativeTo, Position p, Orientation o) {
		setPosition(object, relativeTo, p);
		setOrientation(object, relativeTo, o);
	}
	
	void loadHandles(){
		objectHandles.clear();
		
		IntWA objectHandles = new IntWA(1);
		StringWA objectNames = new StringWA(1);
		IntWA intData = new IntWA(1);
		FloatWA floatData = new FloatWA(1);
		
		// 0: retrieves the object names (in stringData.)  sim_appobj_object_type: all scene objects
		//	int simxGetObjectGroupData(int clientID,int objectType,int dataType,IntWA handles,IntWA intData,FloatWA floatData,StringWA stringData,int remoteApiFunctionOperationMode:BLOCKING/STREAMING) 
		checkOk(server.simxGetObjectGroupData(clientID, server.sim_appobj_object_type, 0, objectHandles, intData, floatData, objectNames, server.simx_opmode_blocking));
		
		int[] handles = objectHandles.getArray();
		String[] names = objectNames.getArray();
		for(int i=0;i<handles.length;i++){
			String name = names[i];
			int handle = handles[i];
			this.objectHandles.put(name, handle);
		}
	}

	@Override
	public boolean checkCollisions(String object) {
		IntW handle = new IntW(0);
		
		checkOk(server.simxGetCollisionHandle(clientID, object, handle, server.simx_opmode_blocking));
		
		BoolW collision = new BoolW(false);
		checkOk(server.simxReadCollision(clientID, handle.getValue(), collision, server.simx_opmode_blocking));
		return collision.getValue();
	
	}
	
	@Override
	public void setProperty(String key, Object value){
		if(value instanceof Integer){
			checkOk(server.simxSetIntegerSignal(clientID, key, (Integer)value, remoteApi.simx_opmode_oneshot));
		} else if(value instanceof Float){
			checkOk(server.simxSetFloatSignal(clientID, key, (Float)value, remoteApi.simx_opmode_oneshot));
		} else if(value instanceof Boolean){
			checkOk(server.simxSetIntegerSignal(clientID, key, ((Boolean)value) ? 1 : 0, server.simx_opmode_oneshot));
		}
	}
	
	@Override
	public Object getProperty(String key){
		IntW value = new IntW(0);
		checkOk(server.simxGetIntegerSignal(clientID, key,  value, server.simx_opmode_blocking));
		return value.getValue();
	}

	
	private void checkOk(int ret){
		if(ret > 3){
			throw new RuntimeException("Failed to execute VREP call "+ret);
		}
	}
}
