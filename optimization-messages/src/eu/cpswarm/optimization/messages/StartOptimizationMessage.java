package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public class StartOptimizationMessage extends Message {
	public static final String TYPE_NAME = "StartOptimization";

	@SerializedName("configuration")
	protected String configuration;
	@SerializedName("SCID")
	protected String scid;
	
	public StartOptimizationMessage(String oid, String configuration, String scid) {
		super(TYPE_NAME, oid);
		this.configuration = configuration;
		this.scid = scid;
	}
	
	public StartOptimizationMessage() {
		this.type = TYPE_NAME;
	}

	public String getConfiguration() {
		return configuration;
	}
	
	public String getSCID() {
		return scid;
	}
}
