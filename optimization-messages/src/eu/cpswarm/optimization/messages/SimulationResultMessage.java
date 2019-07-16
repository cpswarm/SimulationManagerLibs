package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public class SimulationResultMessage extends ReplyMessage {
	public static final String TYPE_NAME = "SimulationResult";

	@SerializedName("SID")
	protected String sid;

	@SerializedName("fitnessValue")
	protected double fitnessValue;


	public SimulationResultMessage(String oid, Boolean success, String sid, double fitnessValue) {
		super(TYPE_NAME, oid, success);
		this.sid = sid;
		this.fitnessValue = fitnessValue;
	}
	
	public SimulationResultMessage() {
		this.type = TYPE_NAME;
	}

	public String getSid() {
		return sid;
	}

	public double getFitnessValue() {
		return fitnessValue;
	}
}
