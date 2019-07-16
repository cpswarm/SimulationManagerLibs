package eu.cpswarm.optimization.messages;

public class GetOptimizationStateMessage extends Message {
	public static final String TYPE_NAME = "GetOptimizationState";

	public GetOptimizationStateMessage(String oid, String TYPE_NAME) {
		super(TYPE_NAME, oid);
	}
	
	public GetOptimizationStateMessage() {
		this.type = TYPE_NAME;
	}
}
