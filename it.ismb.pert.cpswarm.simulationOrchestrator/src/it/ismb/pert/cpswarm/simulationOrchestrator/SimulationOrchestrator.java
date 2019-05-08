package it.ismb.pert.cpswarm.simulationOrchestrator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.jivesoftware.smack.ReconnectionManager;
import org.jivesoftware.smack.ReconnectionManager.ReconnectionPolicy;
import org.jivesoftware.smack.SmackException;
import org.jivesoftware.smack.SmackException.NoResponseException;
import org.jivesoftware.smack.SmackException.NotConnectedException;
import org.jivesoftware.smack.SmackException.NotLoggedInException;
import org.jivesoftware.smack.XMPPException.XMPPErrorException;
import org.jivesoftware.smack.chat2.Chat;
import org.jivesoftware.smack.chat2.ChatManager;
import org.jivesoftware.smack.StanzaListener;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.filter.StanzaFilter;
import org.jivesoftware.smack.filter.StanzaTypeFilter;
import org.jivesoftware.smack.packet.Message;
import org.jivesoftware.smack.packet.Presence;
import org.jivesoftware.smack.roster.Roster;
import org.jivesoftware.smack.roster.RosterGroup;
import org.jivesoftware.smack.roster.Roster.SubscriptionMode;
import org.jivesoftware.smack.sasl.SASLErrorException;
import org.jivesoftware.smack.tcp.XMPPTCPConnection;
import org.jivesoftware.smack.tcp.XMPPTCPConnectionConfiguration;
import org.jivesoftware.smackx.disco.ServiceDiscoveryManager;
import org.jivesoftware.smackx.disco.packet.DiscoverInfo;
import org.jivesoftware.smackx.filetransfer.FileTransfer.Status;
import org.jivesoftware.smackx.filetransfer.FileTransferManager;
import org.jivesoftware.smackx.filetransfer.OutgoingFileTransfer;
import org.jivesoftware.smackx.iqregister.AccountManager;
import org.jxmpp.jid.EntityBareJid;
import org.jxmpp.jid.EntityFullJid;
import org.jxmpp.jid.Jid;
import org.jxmpp.jid.impl.JidCreate;
import org.jxmpp.jid.parts.Localpart;
import org.jxmpp.jid.parts.Resourcepart;
import org.jxmpp.stringprep.XmppStringprepException;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import eu.cpswarm.optimization.messages.GetProgressMessage;
import eu.cpswarm.optimization.messages.MessageSerializer;
import eu.cpswarm.optimization.messages.RunSimulationMessage;
import eu.cpswarm.optimization.messages.StartOptimizationMessage;
import it.ismb.pert.cpswarm.mqttlib.transport.MqttAsyncDispatcher;
import it.ismb.pert.cpswarm.messages.server.Capabilities;
import it.ismb.pert.cpswarm.messages.server.Server;
import it.ismb.pert.cpswarm.simulationOrchestrator.tools.Zipper;
import it.ismb.pert.cpswarm.simulationOrchestrator.xmpp.ConnectionListenerImpl;
import it.ismb.pert.cpswarm.simulationOrchestrator.xmpp.MessageEventCoordinatorImpl;
import it.ismb.pert.cpswarm.simulationOrchestrator.xmpp.PacketListenerImpl;

import javax.net.ssl.SSLContext;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.SecureRandom;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Component(immediate=true,
	service = {SimulationOrchestrator.class}
)
public class SimulationOrchestrator {
	private static final String RESOURCE = "cpswarm";
	private XMPPTCPConnection connection;
	private MqttAsyncDispatcher client;
	private ConnectionListenerImpl connectionListener;
	// private RosterListener rosterListener;
	private String serverName = null;
	private Map<EntityBareJid, Server> simulationManagers = null;
	private String inputDataFolder = null;
	private String outputDataFolder = null;
	private int managerConfigured = 0;
	private List<EntityBareJid> availableManagers = null;
	private Jid optimizationToolJid = null;
	private String optimizationId = null;
	private Boolean monitoring = null;
	// JSon containing the Optimization Configuration
	// TODO receive these configurations from the Launcher
	private String optimizationConfiguration = "{candidateCount:100, repeatCount:1, generationCount:100, simulationTimeoutSeconds:1200, seed:1234}";
	private String simulationConfiguration = null;
	private Server server;
	private String taskId;
	private String serverUsername = "";
	private String serverPassword = "";
	private Boolean optimizationEnabled = null;
	private String configurationFolder = null;
	private boolean localOptimzation = false;
	private static boolean TEST = true;
	private Boolean simulationDone = null;
	private BundleContext context;

	@Deactivate
	public void deactivate() {

		System.out.println(" \n stoping SimulationOrchestrator.......... \n");
	}

	@Activate
	public void activate(BundleContext context) {
		this.context = context;
		TEST = false;
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder;
		InetAddress serverURI = null;
		String serverName = "";
		String serverUsername = "";
		String serverPassword = "";
		String inputDataFolder = "";
		String outputDataFolder = "";
		String optimizationToolUser = "";
		String taskId = "";
		String parameters = "";
		String dimensions = "";
		Long maxAgents = null;
		Boolean guiEnabled = false;
		Boolean monitoring = null;
		String mqttBroker = null;
		Boolean optimizationEnabled = false;
		String configurationFolder = null;
		String optimizationToolPath = null;
		Boolean localOptimization = false;
		String optimizationToolPassword = "";

		try {
			configurationFolder = context.getProperty("conf");
			inputDataFolder = context.getProperty("src");
			outputDataFolder = context.getProperty("target");
			taskId = context.getProperty("id");
			dimensions = context.getProperty("dim");
			maxAgents = Long.parseLong(context.getProperty("max"));
			optimizationEnabled = new Boolean(context.getProperty("opt"));
			guiEnabled = new Boolean(context.getProperty("gui"));

			if (context.getProperty("params") != null) {
				parameters = context.getProperty("params");
			}
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
			String orchestratorConfigFile = context.getProperty("Orchestrator.config.file.orchestrator.xml");
			Document document = documentBuilder.parse(new FileInputStream(orchestratorConfigFile));
			serverURI = InetAddress.getByName(document.getElementsByTagName("serverURI").item(0).getTextContent());
			serverName = document.getElementsByTagName("serverName").item(0).getTextContent();
			serverUsername = document.getElementsByTagName("username").item(0).getTextContent();
			serverPassword = document.getElementsByTagName("serverPassword").item(0).getTextContent();
			optimizationToolUser = document.getElementsByTagName("optimizationUser").item(0).getTextContent();
			localOptimization = Boolean
					.parseBoolean(document.getElementsByTagName("localOptimization").item(0).getTextContent());
			optimizationToolPassword = document.getElementsByTagName("optimizationToolPassword").item(0)
					.getTextContent();
			if (localOptimization) {
				optimizationToolPath = document.getElementsByTagName("optimizationToolPath").item(0).getTextContent();
			}

			monitoring = Boolean.parseBoolean(document.getElementsByTagName("monitoring").item(0).getTextContent());
			if (monitoring) {
				mqttBroker = document.getElementsByTagName("mqttBroker").item(0).getTextContent();
			}
			if (!inputDataFolder.endsWith(File.separator)) {
				inputDataFolder += File.separator;
			}
			if (!outputDataFolder.endsWith(File.separator)) {
				outputDataFolder += File.separator;
			}
			if (!configurationFolder.endsWith(File.separator)) {
				configurationFolder += File.separator;
			}
			if (!new File(inputDataFolder).isDirectory()) {
				System.out.println("src must be a folder");
				return;
			}
		} catch (ParserConfigurationException | SAXException | IOException e1) {
			e1.printStackTrace();
			return;
		}
		startSimulationOrchestrator(serverURI, serverName, serverUsername, serverPassword, inputDataFolder,
				outputDataFolder, optimizationToolUser, monitoring, mqttBroker, taskId, guiEnabled, parameters,
				dimensions, maxAgents, optimizationEnabled, configurationFolder, localOptimization,
				optimizationToolPath, optimizationToolPassword);
		while (true) {
		}
	}

	/**
	 * 
	 * @param serverIP
	 *            IP of the XMPP server
	 * @param serverName
	 *            Name of the XMPP server
	 * @param serverUsername
	 *            Username to be used to connect to the XMPP server
	 * @param serverPassword
	 *            Password to be used to connect to the XMPP server
	 * @param inputDataFolder
	 *            Folder to be used as source for the files
	 * @param outputDataFolder
	 *            Folder to be used to store the files
	 * @param optimizationToolUser
	 *            JID of the Optimization Tool
	 * @param monitoring
	 *            Flag to enable or disable the thread which monitor the progress of
	 *            the optimization process
	 * @param mqttBroker
	 *            If the monitor is enabled, this is the IP of the MQTT broker where
	 *            the messages are forwarded
	 * @param taskId
	 *            ID of the task
	 * @param guiEnabled
	 *            Indicates if the GUI is enabled or not
	 * @param parameters
	 *            Parameters to be used for the simulation
	 * @param dimensions
	 *            Number of dimensions required for the simulation
	 * @param maxAgents
	 *            Maximum number of agents required for the simulation
	 * @param optimization
	 *            Indicates if the optimization is enabled or not
	 * @param configurationFolder
	 *            Folder with the configuration files
	 * @param localOptimization
	 *            Indicates if the Optimization Tool has to be launched by the
	 *            Orchestrator
	 * @param optimizationToolPath
	 *            Path of the Optimization Tool
	 * @param optimizationToolPassword
	 *            To be used to start the optimization tool directly from the
	 *            orchestrator (localOptimization = true)
	 */
	public void startSimulationOrchestrator(final InetAddress serverIP, final String serverName,
			final String serverUsername, final String serverPassword, final String inputDataFolder,
			final String outputDataFolder, final String optimizationToolUser, final boolean monitoring,
			final String mqttBroker, final String taskId, final Boolean guiEnabled, final String parameters,
			final String dimensions, final Long maxAgents, final Boolean optimization, final String configurationFolder,
			final Boolean localOptimization, final String optimizationToolPath, final String optimizationToolPassword) {
		System.out.println("\n startSimulationOrchestrator...................\n");
		this.taskId = taskId;
		this.serverName = serverName;
		this.inputDataFolder = inputDataFolder;
		this.outputDataFolder = outputDataFolder;
		this.serverUsername = serverUsername;
		this.serverPassword = serverPassword;
		this.simulationManagers = new HashMap<EntityBareJid, Server>();
		this.monitoring = monitoring;
		this.optimizationId = taskId + "!" + UUID.randomUUID();
		this.simulationConfiguration = "visual:=" + (guiEnabled ? "true" : "false") + parameters.toString();
		this.optimizationEnabled = optimization;
		this.configurationFolder = configurationFolder;
		this.localOptimzation = localOptimization;
		server = new Server();
		server.setServer("Orchestrator");
		Capabilities caps = new Capabilities();
		caps.setDimensions(dimensions);
		caps.setMaxAgents(maxAgents);
		server.setCapabilities(caps);
		try {
			if (this.optimizationEnabled && this.localOptimzation) {
				String optimizationToolParameters = "-n " + this.serverName + " -ip " + serverIP + " -p 5222 -r "
						+ RESOURCE + " -cid " + optimizationToolUser + " -cp " + optimizationToolPassword + " -c "
						+ this.outputDataFolder + "candidate";
				OptimizationToolLauncher launcher = new OptimizationToolLauncher(optimizationToolPath,
						optimizationToolParameters);
				Thread thread = new Thread(launcher);
				thread.start();
			}
			this.optimizationToolJid = JidCreate.from(optimizationToolUser + "@" + serverName + "/" + RESOURCE);

			final SSLContext sc = SSLContext.getInstance("TLS");
			sc.init(null, null, new SecureRandom());

			XMPPTCPConnectionConfiguration connectionConfig = XMPPTCPConnectionConfiguration
					.builder().setHostAddress(serverIP).setPort(5222)
					.setXmppDomain(serverName)
					.setCompressionEnabled(false).setCustomSSLContext(sc)
					.build();
			connection = new XMPPTCPConnection(connectionConfig);

			final StanzaFilter presenceFilter = new StanzaTypeFilter(Presence.class);
			// This listener checks the presences
			final PacketListenerImpl packetListener = new PacketListenerImpl(this);
			this.addAsyncStanzaListener(packetListener, presenceFilter);
			System.out.println("adding the packet listener to the local connection");

			connection.connect();

			connection.login(serverUsername, serverPassword, Resourcepart.from(RESOURCE));
			System.out.println("Connected to server");

			connectionListener = new ConnectionListenerImpl(this);
			// Adds a listener for the status of the connection
			connection.addConnectionListener(connectionListener);

			ReconnectionManager reconnectionManager = ReconnectionManager.getInstanceFor(connection);
			reconnectionManager.enableAutomaticReconnection();
			reconnectionManager.setReconnectionPolicy(ReconnectionPolicy.RANDOM_INCREASING_DELAY);

			// Adds the listener for the incoming messages
			ChatManager.getInstanceFor(connection).addIncomingListener(new MessageEventCoordinatorImpl(this));

			do {
				Thread.sleep(1000);
			} while (!connection.isConnected() || !connection.isAuthenticated());

			final Presence presence = new Presence(Presence.Type.available);
			presence.setStatus("Pronto");
			try {
				connection.sendStanza(presence);
			} catch (final NotConnectedException | InterruptedException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

			// If the monitoring is needed, it instantiates also the MQTT broker
			if (monitoring) {
				client = new MqttAsyncDispatcher(mqttBroker, UUID.randomUUID().toString(), null, null, true, null);
				// connect the client
				client.connect();
				while (!client.isConnected()) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		} catch (final SmackException | IOException | XMPPException e) {
			if (e instanceof SASLErrorException) {
				connection.disconnect();
				createAccount(serverPassword);
			}
			System.out.println("msg " + e.getMessage());
			System.out.println("loc " + e.getLocalizedMessage());
			System.out.println("cause " + e.getCause());
			System.out.println("excep " + e);
			e.printStackTrace();
			return;
		} catch (Exception me) {
			System.out.println("msg " + me.getMessage());
			System.out.println("loc " + me.getLocalizedMessage());
			System.out.println("cause " + me.getCause());
			System.out.println("excep " + me);
			me.printStackTrace();
			return;
		}

		addOptimizationToTheRoster();
		// In case of test the evaluation is done only after that the dummy manager is
		// started
		if (!TEST) {
			this.evaluateSimulationManagers();
		}
	}

	private boolean createAccount(final String password) {
		final AccountManager accountManager = AccountManager.getInstance(connection);
		final HashMap<String, String> props = new HashMap<String, String>();
		// The description will be the property name of the account
		props.put("name", "server");
		Localpart part;
		try {
			part = Localpart.from(serverUsername);
			connection.connect();
			accountManager.createAccount(part, password, props);
			connection.login(serverUsername, password, Resourcepart.from(RESOURCE));
		} catch (InterruptedException | SmackException | IOException | XMPPException me) {
			System.out.println("msg " + me.getMessage());
			System.out.println("loc " + me.getLocalizedMessage());
			System.out.println("cause " + me.getCause());
			System.out.println("excep " + me);
			return false;
		}
		addOptimizationToTheRoster();
		this.evaluateSimulationManagers();
		return true;
	}

	public void evaluateSimulationManagers() {
		try {
			System.out.println("Wait to collect the managers");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.evaluateSimulationManagers(server);
	}

	public void evaluateSimulationManagers(Server serverCompare) {
		this.managerConfigured = 0;
		System.out.println("Evalauting available managers: " + Arrays.toString(simulationManagers.keySet().toArray()));
		String fileName = null;
		if (TEST && (inputDataFolder == null || configurationFolder == null)) {
			String configFile = context.getProperty("Orchestrator.config.fileXSD");
			File file = new File(configFile);

			fileName = file.getAbsolutePath();
		} else {
			Zipper zipper = new Zipper(inputDataFolder);
			zipper.generateFileList(new File(inputDataFolder));
			zipper.updateSourceFolder(configurationFolder);
			zipper.generateFileList(new File(configurationFolder));
			String[] fileNameParts = (inputDataFolder + "test.zip").split("\\.");
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH_mm_ss");
			Date date = new Date();
			fileName = fileNameParts[0] + "_" + dateFormat.format(date) + "." + fileNameParts[1];
			zipper.zipIt(fileName);
		}
		availableManagers = new ArrayList<EntityBareJid>();
		for (EntityBareJid account : simulationManagers.keySet()) {
			if (simulationManagers.get(account) != null
					&& simulationManagers.get(account).compareTo(serverCompare) > 0) {
				if (!availableManagers.contains(account)) {
					availableManagers.add(account);
					// If there is not optimization the first simulator available is selected
					if (!optimizationEnabled) {
						break;
					}
				}
			}
		}
		System.out.println("availableManagers are " + availableManagers);
		for (EntityBareJid availableManager : availableManagers) {
			if (!TEST) {
				System.out.println("Configuring the simulation manager: " + availableManager);
				try {
					this.transferFile(JidCreate.entityFullFrom(availableManager.toString() + "/" + RESOURCE), fileName,
							taskId);
				} catch (XmppStringprepException e) {
					e.printStackTrace();
				}
			} else {
				this.addManagerConfigured();
			}
		}
		if (!TEST) {
			// It deletes the zip file
			File file = new File(fileName);
			if (file.delete()) {
				System.out.println(file.getName() + " is deleted!");
			} else {
				System.out.println("Delete operation is failed.");
			}
		}
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
	private boolean addAsyncStanzaListener(final StanzaListener listener, final StanzaFilter filter) {
		try {
			connection.addAsyncStanzaListener(listener, filter);
			return true;
			// The client is disconnected
		} catch (final IllegalStateException e) {
			System.out.println("Connection disconnected, packet listener addition interrupted");
			return false;
		}
	}

	/**
	 * This method verifies if the receiver supports the file transfer and in this
	 * case it sends a file
	 */
	public void transferFile(final EntityFullJid receiver, final String filePath, final String message) {
		final ServiceDiscoveryManager disco = ServiceDiscoveryManager.getInstanceFor(connection);
		System.out.println("SOO transfers file from "+filePath +"  to "+ receiver +" with message = " + message);
		// Receives the info about the client of the receiver
		DiscoverInfo discoInfo = null;
		try {
			discoInfo = disco.discoverInfo(receiver);
		} catch (XMPPException | NoResponseException | NotConnectedException | InterruptedException e) {
			e.printStackTrace();
		}

		// Controls if the file transfer is supported
		if (discoInfo.containsFeature("http://jabber.org/protocol/si/profile/file-transfer")) {
			final FileTransferManager manager = FileTransferManager.getInstanceFor(connection);
			OutgoingFileTransfer transfer = null;
			transfer = manager.createOutgoingFileTransfer(receiver);
			// Here the file is actually sent
			try {
				transfer.sendFile(new File(filePath), message);
				System.out.println("File sent, waiting transfer complete");
				while (!transfer.isDone() && transfer.getException() == null) {
					Exception ex = transfer.getException();
					if (transfer.getStatus() == Status.refused) {
						System.out.println("Transfer refused");
					}
					Thread.sleep(1000);
				}
			} catch (final SmackException | InterruptedException e) {
				e.printStackTrace();
			}
			final Status status = transfer.getStatus();
			if (status == Status.cancelled) {
				System.out.println("Transfer cancelled");
			} else if (status == Status.error) {
				System.out.println("Error in file transfer" + transfer.getError());
			} else if (status == Status.complete) {
				System.out.println("File transfered");
			}
		} else {
			System.out.println("Error, the Simulation manager: " + receiver + " doesn't support the file transfer");
		}
	}

	/**
	 * Method used to add to the roster the Optimization Tool
	 *
	 * @throws XMPPException
	 *             if something is wrong
	 */
	private void addOptimizationToTheRoster() {
		System.out.println(" \n SOO addOptimizationToTheRoster....... \n");
		// Sets the type of subscription of the roster
		final Roster roster = Roster.getInstanceFor(connection);
		roster.setSubscriptionMode(SubscriptionMode.accept_all);
		try {
			final String[] groups = { "optimization" };
			final RosterGroup group = roster.getGroup("optimization");
			if (group != null) {
				if (!group.contains(optimizationToolJid.asBareJid())) {
					roster.createEntry(optimizationToolJid.asBareJid(), "optimization", groups);
				}
			} else {
				roster.createEntry(optimizationToolJid.asBareJid(), "optimization", groups);
			}

		} catch (NotLoggedInException | NoResponseException | XMPPErrorException | NotConnectedException
				| InterruptedException e) {
			// The client is disconnected
			System.out.println("Connection disconnected, adding system bundles to roster interrupted");
			e.printStackTrace();
		}
	}

	public synchronized void addManagerConfigured() {
		managerConfigured++;
		// If all the managers are configured the Simulation Orchestrator configure the
		// Optmization Tool
		if (managerConfigured == this.availableManagers.size()) {
			if (optimizationEnabled) {
				sendStartOptimization();
			} else {
				sendRunSimulation();
			}
		}
	}

	public boolean sendGetProgress() {
		if (!connection.isConnected()) {
			// the connection need to be reconnected
			this.reconnect();
			do {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} while (connection.isConnected());
		}
		GetProgressMessage getProgress = new GetProgressMessage(optimizationId, "Get Progress message");
		ChatManager manager = ChatManager.getInstanceFor(connection);
		Chat chat = manager.chatWith(this.optimizationToolJid.asEntityBareJidIfPossible());
		Message message = new Message();
		MessageSerializer serializer = new MessageSerializer();
		String messageToSend = serializer.toJson(getProgress);
		message.setBody(messageToSend);
		System.out.println("Sending getProgress " + messageToSend);
		try {
			chat.send(message);
		} catch (NotConnectedException | InterruptedException e) {
			System.out.println("Error sending GetProgress message");
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private boolean sendStartOptimization() {
		List<String> managersJid = new ArrayList<String>();
		for (EntityBareJid availableManager : this.availableManagers) {
			managersJid.add(availableManager.toString());
		}
		StartOptimizationMessage start = new StartOptimizationMessage(this.optimizationId, "Start Optimization message",
				optimizationConfiguration, simulationConfiguration, managersJid);
		MessageSerializer serializer = new MessageSerializer();
		String messageToSend = serializer.toJson(start);
		System.out.println("Sending StartOptimization message: " + messageToSend);
		ChatManager manager = ChatManager.getInstanceFor(connection);
		Chat chat = manager.chatWith(this.optimizationToolJid.asEntityBareJidIfPossible());
		Message message = new Message();
		message.setBody(messageToSend);
		try {
			chat.send(message);
		} catch (NotConnectedException | InterruptedException e) {
			System.out.println("Error sending StartOptimization message");
			e.printStackTrace();
			return false;
		}
		return true;
	}

	private String readFile(String path, Charset encoding) throws IOException {
		byte[] encoded = Files.readAllBytes(Paths.get(path));
		return new String(encoded, encoding);
	}

	private boolean sendRunSimulation() {
		String candidateToSend = "";
		try {
			if (TEST && this.configurationFolder == null) {
				String testCandidateFile = context.getProperty("test.candidate.file");
				candidateToSend = this.readFile(new File(testCandidateFile).getAbsolutePath(), StandardCharsets.UTF_8);
			} else {
				// Gazebo
				 candidateToSend = this.readFile(this.configurationFolder+File.separator+"candidate.c", StandardCharsets.UTF_8);
				// Stage
				//candidateToSend = this.readFile(this.inputDataFolder + File.separator + "candidate.h", StandardCharsets.UTF_8);
			}
		} catch (IOException e1) {
			e1.printStackTrace();
			return false;
		}
		RunSimulationMessage run = new RunSimulationMessage(this.optimizationId, "Run simulation message", "1",
				simulationConfiguration, candidateToSend);
		MessageSerializer serializer = new MessageSerializer();
		String messageToSend = serializer.toJson(run);
		System.out.println("Sending RunSimulation message: "/* +messageToSend */);
		ChatManager manager = ChatManager.getInstanceFor(connection);
		Chat chat = manager.chatWith(availableManagers.get(0));
		Message message = new Message();
		message.setBody(messageToSend);
		try {
			chat.send(message);
		} catch (NotConnectedException | InterruptedException e) {
			System.out.println("Error sending RunSimulation message");
			e.printStackTrace();
			return false;
		}
		return true;
	}

	public XMPPTCPConnection getConnection() {
		return connection;
	}

	public synchronized void putSimulationManager(EntityBareJid jid, Server server) {
		System.out
				.println("Adding " + jid.toString() + " to " + Arrays.toString(simulationManagers.keySet().toArray()));
		simulationManagers.put(jid, server);
		System.out.println("Available managers: " + Arrays.toString(simulationManagers.keySet().toArray()));
	}

	public void removeSimulationManager(Jid jid) {
		simulationManagers.remove(jid);
	}

	public Jid getOptimizationJid() {
		return optimizationToolJid;
	}

	public String getOptimizationId() {
		return optimizationId;
	}

	public Boolean isMonitoring() {
		return monitoring;
	}

	public MqttAsyncDispatcher getMqttClient() {
		return client;
	}

	public Boolean getMonitoring() {
		return monitoring;
	}

	public Boolean getOptimizationEnabled() {
		return optimizationEnabled;
	}

	public void setOptimizationEnabled(Boolean optimizationEnabled) {
		this.optimizationEnabled = optimizationEnabled;
	}

	public Boolean isSimulationDone() {
		return simulationDone;
	}

	public void setSimulationDone(boolean simulationDone) {
		System.out.println("Set simulation done");
		this.simulationDone = simulationDone;
	}

	public void reconnect() {
		try {
			connection.disconnect();
			Thread.sleep(1000);
			connection.connect();

			connection.login(serverUsername, serverPassword, Resourcepart.from(RESOURCE));
			System.out.println("Connected to server");

		} catch (SmackException | IOException | XMPPException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}