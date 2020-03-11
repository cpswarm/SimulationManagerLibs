package simulation;

import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.UUID;
import javax.net.ssl.SSLContext;
import org.jivesoftware.smack.ReconnectionManager;
import org.jivesoftware.smack.ReconnectionManager.ReconnectionPolicy;
import org.jivesoftware.smack.SmackConfiguration;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.SmackException.NotLoggedInException;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.chat2.Chat;
import org.jivesoftware.smack.chat2.ChatManager;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.roster.Roster.SubscriptionMode;
import org.jivesoftware.smack.roster.RosterGroup;
import org.jivesoftware.smack.sasl.SASLErrorException;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jivesoftware.smackx.filetransfer.FileTransferManager;
import org.jivesoftware.smackx.iqregister.AccountManager;
import org.jxmpp.jid.Jid;
import org.jxmpp.jid.impl.JidCreate;
import org.jxmpp.jid.parts.Localpart;
import org.jxmpp.jid.parts.Resourcepart;
import com.google.gson.Gson;
import eu.cpswarm.optimization.messages.ReplyMessage;
import eu.cpswarm.optimization.messages.MessageSerializer;
import eu.cpswarm.optimization.messages.SimulationResultMessage;
import eu.cpswarm.optimization.statuses.SimulationManagerCapabilities;
import eu.cpswarm.optimization.statuses.SimulationManagerStatus;
import it.ismb.pert.cpswarm.mqttlib.transport.MqttAsyncDispatcher;
import simulation.xmpp.AbstractFileTransferListener;
import simulation.xmpp.AbstractMessageEventCoordinator;
import simulation.xmpp.ConnectionListenerImpl;
import simulation.xmpp.PresencePacketListener;


public abstract class SimulationManager {
	private static final String RESOURCE = "cpswarm";
	private XMPPTCPConnection connection;
	private SimulationManagerStatus simulationManagerStatus;
	private SimulationManagerCapabilities simulationManagerCapabilities;
	private boolean available = true;
	private boolean started = false;
	private boolean optimizationToolAvailable = false;
	private boolean orchestratorAvailable = false;
	private ConnectionListenerImpl connectionListener;
	private StanzaListener packetListener;
	private String serverName = null;
	private String clientID = null;
	protected Jid clientJID = null;
	private Jid optimizationToolJID = null;
	private Jid orchestratorJID = null;
	private String dataFolder = null;
	private String optimizationID = null;
	private String simulationID = null;
	private String rosFolder = null; 
	private String catkinWS = null;
	private String simulationConfiguration = null;
	private MqttAsyncDispatcher client = null;
	private boolean monitoring = false;
	private String testResult = "";
	private String mqttBroker = "";
	private int timeout = 90000;
	private boolean fake = true;
	private String SCID = null;
	private String launchFile = null;
	private String bagPath = null;
	private int simulationSeed = 0;
	private String fitnessFunction =null;
	private int maxNumberOfCarts = 0;
	
	public static enum VERBOSITY_LEVELS {
		NO_DEBUG,
		ONLY_FITNESS_SCORE,
		ALL;
	};
	
	public static VERBOSITY_LEVELS CURRENT_VERBOSITY_LEVEL = VERBOSITY_LEVELS.ALL;

	public boolean connectToXMPPserver(final InetAddress serverIP, final String serverName, final String serverPassword, final String dataFolder, final String rosFolder, final SimulationManagerStatus simulationManagerStatus, final String optimizationUser, final String orchestratorUser, String uuid, boolean debug, final boolean monitoring, final String mqttBroker, final int timeout, final boolean fake, final String launchFile, final String fitnessFunction, final int maxNumberOfCarts) {
		if(uuid.isEmpty()) {
			uuid = UUID.randomUUID().toString();
		}
	
		clientID = "manager_"+uuid;
		this.serverName = serverName;
		this.dataFolder = dataFolder;
		this.rosFolder = rosFolder;
		if(!rosFolder.endsWith("src"+File.separator)) {
			if(rosFolder.endsWith("src")) {
				this.rosFolder+=File.separator;
			} else {
				if(!rosFolder.endsWith(File.separator)) {
					this.rosFolder+=File.separator;
				}
				this.rosFolder+="src"+File.separator;
			}
		}
		this.simulationManagerStatus = simulationManagerStatus;
		this.simulationManagerCapabilities = simulationManagerStatus.getCapabilities();
		this.catkinWS = rosFolder.substring(0,rosFolder.indexOf("src"));
		this.monitoring = monitoring;
		this.mqttBroker  = mqttBroker;
		this.timeout = timeout;
		this.fake = fake;
		this.launchFile = launchFile;
		this.fitnessFunction = fitnessFunction;
		this.maxNumberOfCarts = maxNumberOfCarts;
		ProcessBuilder builder = new ProcessBuilder();
		String home = builder.environment().get("HOME");
		if(home == null)
			home = "/root";
		bagPath = home + File.separator + ".ros" + File.separator;
		builder = null;		
		System.out.println("Create a simulation manager with clientID = "+clientID+" \n");
		try {

			clientJID = JidCreate.from(clientID+"@"+serverName+"/"+RESOURCE);
			optimizationToolJID = JidCreate.from(optimizationUser+"@"+serverName+"/"+RESOURCE);
			orchestratorJID = JidCreate.from(orchestratorUser+"@"+serverName+"/"+RESOURCE);
			final SSLContext sc = SSLContext.getInstance("TLS");
			sc.init(null, null, new SecureRandom());
			SmackConfiguration.DEBUG = false;
			XMPPTCPConnectionConfiguration connectionConfig = XMPPTCPConnectionConfiguration
					.builder().setHostAddress(serverIP).setPort(5222)
					.setXmppDomain(serverName)
					.setCompressionEnabled(false).setCustomSSLContext(sc)
					.build();
			connection = new XMPPTCPConnection(connectionConfig);
			connection.connect();
			
			if(CURRENT_VERBOSITY_LEVEL.equals(VERBOSITY_LEVELS.ALL)) {
				System.out.println("Connected to server");
			}

			connectionListener = new ConnectionListenerImpl(this);
			// Adds a listener for the status of the connection
			connection.addConnectionListener(connectionListener);

			ReconnectionManager reconnectionManager = ReconnectionManager.getInstanceFor(connection);
			reconnectionManager.enableAutomaticReconnection();
			reconnectionManager.setReconnectionPolicy(ReconnectionPolicy.RANDOM_INCREASING_DELAY);
			
			//rosterListener = new RosterListenerImpl(this);
			// Adds a roster listener
			//addRosterListener(rosterListener);

			// Adds the packet listener, used to catch the requests
			// of adding this client to the roster
			final StanzaFilter presenceFilter = new StanzaTypeFilter(
					Presence.class);
			packetListener = new PresencePacketListener(this);
			this.addAsyncStanzaListener(packetListener, presenceFilter);
			connection.login(clientID, serverPassword , Resourcepart.from(RESOURCE));
			Thread.sleep(2000);
			this.sendPresence();
			startMonitoring();
			
		} catch (final SmackException | IOException | XMPPException e) {
			if (e instanceof SASLErrorException) {
				connection.disconnect();
				if(!createAccount(serverPassword, simulationManagerStatus)) {
					System.out.println("Failed to connect to XMPP server");
					return false;
				}
			}
		} catch(Exception me) {
			System.out.println("msg "+me.getMessage());
			System.out.println("loc "+me.getLocalizedMessage());
			System.out.println("cause "+me.getCause());
			System.out.println("excep "+me);
			me.printStackTrace();
		}
		
		addOrchestratorAndOptimizationToTheRoster();
		return true;
	}


    private boolean createAccount(final String password, final SimulationManagerStatus simulationManagerStatus) {
		final AccountManager accountManager = AccountManager
				.getInstance(connection);
		final HashMap<String, String> props = new HashMap<String, String>();
		// The description will be the property name of the account
		props.put("name", "server");
		Localpart part;
		try {
			part = Localpart.from(clientID);
			connection.connect();
			accountManager.createAccount(part, password, props);
			connection.login(clientID, password, Resourcepart.from(RESOURCE));
			Thread.sleep(2000);
			startMonitoring();
		} catch (InterruptedException | SmackException | IOException | XMPPException me) {
            System.out.println("msg "+me.getMessage());
            System.out.println("loc "+me.getLocalizedMessage());
            System.out.println("cause "+me.getCause());
            System.out.println("excep "+me);
            me.printStackTrace();
			return false;
		}
		return true;
    }

    protected void addFileTransfer(final AbstractFileTransferListener listener) {
    	final FileTransferManager manager = FileTransferManager
    			.getInstanceFor(connection);
    	manager.addFileTransferListener(listener);    	
    }
    
    
    protected void addMessageEventCoordinator(final AbstractMessageEventCoordinator coordinator) {
    	// Adds the listener for the incoming messages
    	ChatManager.getInstanceFor(connection).addIncomingListener(coordinator);
    }
    
    
	/**
	 * Method used to add a {@link PacketListener</code> to the connection
	 *
	 * @param listener
	 *            the listener that will receive the notification
	 *
	 * @return a <code>boolean</code>: true if all is ok, otherwise false
	 *
	 *
	 * @throws AsserionError
	 *             if something is wrong
	 *
	 *
	 */
	private boolean addAsyncStanzaListener(final StanzaListener listener,
			final StanzaFilter filter) {
		try {
			connection.addAsyncStanzaListener(listener, filter);
			return true;
			// The client is disconnected
		} catch (final IllegalStateException e) {
			System.out.println(
					"Connection disconnected, packet listener addition interrupted");
			return false;
		}
	}
    

	/**
	 * Method used to add to the roster the Orchestrator and the Optimization Tool
	 *
	 * @throws XMPPException
	 *             if something is wrong
	 */
	private void addOrchestratorAndOptimizationToTheRoster() {
		// Sets the type of subscription of the roster
		final Roster roster = Roster.getInstanceFor(connection);
		roster.setSubscriptionMode(SubscriptionMode.accept_all);
		try {
			final String[] groups = { "orchestrator" };
			RosterGroup group = roster
				.getGroup("orchestrator");		
			if (group != null) {
				if (!group.contains(orchestratorJID)) {
					roster.createEntry(orchestratorJID.asBareJid(),
							"orchestrator", groups);
				} 
			} else {
				roster.createEntry(orchestratorJID.asBareJid(),
						"orchestrator", groups);
			}
			
			final String[] groups2 = { "optimization" };
			group = roster
				.getGroup("optimization");
			if (group != null) {
				if (!group.contains(optimizationToolJID)) {
					roster.createEntry(optimizationToolJID.asBareJid(),
							"optimization", groups2);
				} 
			} else {
				roster.createEntry(optimizationToolJID.asBareJid(),
						"optimization", groups2);
			}			
			
		} catch (NotLoggedInException | NoResponseException | XMPPErrorException
				| NotConnectedException | InterruptedException e) {
			// The client is disconnected
			System.out.println(
					"Connection disconnected, adding system bundles to roster interrupted");
		} 
	}

	
	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean availalble) {
		this.available = availalble;
	}
	
	
	public boolean publishFitness(SimulationResultMessage message, String paramsString, Integer counter) {  // if(this.isOptimizationToolAvailable()){} exists, no need to publish, no error info, user don't know that
		MessageSerializer serializer = new MessageSerializer();
		String messageToSend = serializer.toJson(message);
		try {
			ChatManager chatManager = ChatManager.getInstanceFor(this.getConnection());
			Chat chat = chatManager.chatWith(optimizationToolJID.asEntityBareJidIfPossible());
			Message xmppMessage = new Message();
			xmppMessage.setBody(messageToSend);
			chat.send(xmppMessage);
			if(!CURRENT_VERBOSITY_LEVEL.equals(VERBOSITY_LEVELS.NO_DEBUG)) {
				System.out.println("fitness score: "+ messageToSend + " sent");
			}
		} catch (NotConnectedException | InterruptedException e) {
			System.out.println("Error sending the result of the simulation: "+messageToSend);
			e.printStackTrace();
			return false;
		} 
		StringBuilder builder = null;
		int count = 3;
		boolean success = false;
		if(monitoring && message.getSuccess()) {
			builder = new StringBuilder();  // SID is in the format of s_(optimizationID)_1
			builder.append("{ \"SID\" : \""+message.getSimulationId().split("_")[2]+" ("+counter+" carts)\", ");
			builder.append(" \"fitnessValue\" : "+message.getFitnessValue());
			if(paramsString!=null) {
				builder.append(", ");
				String [] params = paramsString.split(",");
				for(int i = 0; i < params.length; i++) {
					String[] keyValue = params[i].split(":");
					builder.append("\""+keyValue[0]+"\" : "+keyValue[1]);
					if(i<params.length-1) {
						builder.append(", ");
					}
					keyValue = null;
				}
			}
			builder.append("}");
			if(!CURRENT_VERBOSITY_LEVEL.equals(VERBOSITY_LEVELS.NO_DEBUG)) {
				System.out.println("publishFitness: msg = "+builder.toString());
			}  // wait for maximum 4 times  to publish the fitness			
			success = client.publish("/cpswarm/"+optimizationID+"/fitness", builder.toString().getBytes());
			while(!success && count>0) {
				try {
					Thread.sleep(30000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				success = client.publish("/cpswarm/"+optimizationID+"/fitness", builder.toString().getBytes());
				count-=1;
			}
			builder = null;
			
		}
		return true;
	}
	
	private void startMonitoring() {
		// If the monitoring is needed, it instantiates also the MQTT broker
		if(monitoring) {
			client = new MqttAsyncDispatcher(mqttBroker, UUID.randomUUID().toString(), null,
					null, true, null);
			// connect the client
			client.connect();
			while(!client.isConnected()){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

		}
	}
	
	public void sendPresence() {
		final Presence presence = new Presence(Presence.Type.available);
		Gson gson = new Gson();
		SimulationManagerStatus simulationManagerStatus = new SimulationManagerStatus(SCID, simulationID, simulationManagerCapabilities);
		presence.setStatus(gson.toJson(simulationManagerStatus));
		try {
			connection.sendStanza(presence);
		} catch (final NotConnectedException | InterruptedException e) {
			e.printStackTrace();
		}
		simulationManagerStatus =null;
	}

	public String getFitnessFunction() {
		return fitnessFunction;
	}
	
	public int getMaxNumberOfCarts() {
		return maxNumberOfCarts;
	}

	public String getLaunchFile() {
		return launchFile;
	}
	
	public void setLaunchFile(String launchFile) {
		this.launchFile = launchFile;
	}
	
	public boolean isStarted() {
		return started;
	}

	public SimulationManagerStatus getSimulationManagerStatus() {
		return simulationManagerStatus;
	}
	
	public SimulationManagerCapabilities getSimulationManagerCapabilities() {
		return simulationManagerCapabilities;
	}
	
	public Jid getOptimizationJID() {
		return optimizationToolJID;
	}

	public Jid getOrchestratorJID() {
		return orchestratorJID;
	}	

	public void setSimulationID(String simulationID) {
		this.simulationID = simulationID;
		this.sendPresence();
	}
	
	public String getSimulationID() {
		return simulationID;
	}
	
	public int getSimulationSeed() {
		return simulationSeed;
	}
	
	public void setSimulationSeed(int simulationSeed) {
		this.simulationSeed = simulationSeed;
	}

	public String getSimulationConfiguration() {
		return simulationConfiguration;
	}

	public void setSimulationConfiguration(String simulationConfiguration) {
		this.simulationConfiguration = simulationConfiguration;
	}

	public String getDataFolder() {
		return dataFolder;
	}
	
	public String getRosFolder() {
		return rosFolder;
	}
	
	public String getCatkinWS() {
		return catkinWS;
	}
	
	public XMPPTCPConnection getConnection() {
		return connection;
	}
	
	public Jid getJid() {
		return clientJID;
	}
	
	public String getTestResult() {
		return testResult;
	}

	public void setTestResult(String testResult) {
		this.testResult = testResult;
	}

	public int getTimeout() {
		return timeout;
	}

	public void setTimeout(int timeout) {
		this.timeout = timeout;
	}

	public boolean isFake() {
		return fake;
	}

	public void setFake(boolean fake) {
		this.fake = fake;
	}
	
	public String getOptimizationID() {
		return optimizationID;
	}
	
	public void setOptimizationID(String optimizationID) {
		this.optimizationID = optimizationID;
	}
	
	public String getSCID() {
		return SCID;
	}
	
	public void setSCID(String SCID) {
		this.SCID = SCID;
	//	this.sendPresence();
	}
	
	public boolean isOptimizationToolAvailable() {
		return optimizationToolAvailable;
	}

	public void setOptimizationToolAvailable(boolean optimizationToolAvailable) {
		this.optimizationToolAvailable = optimizationToolAvailable;
	}

	public boolean isOrchestratorAvailable() {
		return orchestratorAvailable;
	}

	public void setOrchestratorAvailable(boolean orchestratorAvailable) {
		this.orchestratorAvailable = orchestratorAvailable;
	}
	
	public String getBagPath() {
		return bagPath;
	}

	
	
}
