package eu.cpswarm.optimization.messages;

public class GetOptimizationStateMessage extends Message {
	public static final String TYPE_NAME = "GetOptimizationState";

	public GetOptimizationStateMessage(String oid) {
		super(TYPE_NAME, oid);
	}
	
	public GetOptimizationStateMessage() {
		this.type = TYPE_NAME;
	}
}
