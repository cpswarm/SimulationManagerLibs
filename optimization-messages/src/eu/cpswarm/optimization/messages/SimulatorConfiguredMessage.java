package eu.cpswarm.optimization.messages;

public class SimulatorConfiguredMessage extends ReplyMessage {

	public static final String TYPE_NAME = "SimulatorConfigured";

	public SimulatorConfiguredMessage(String oid, Boolean success) {
		super(TYPE_NAME, oid, success);
	}
	
	public SimulatorConfiguredMessage() {
		this.type = TYPE_NAME;
	}
}
