package eu.cpswarm.optimization.messages;

public class CancelOptimizationMessage extends Message {
	public static final String TYPE_NAME = "CancelOptimization";

	public CancelOptimizationMessage(String oid) {
		super(TYPE_NAME, oid);
	}
	
	public CancelOptimizationMessage() {
		this.type = TYPE_NAME;
	}
}
