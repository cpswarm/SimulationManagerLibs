package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public class RunSimulationMessage extends Message {
	public static final String TYPE_NAME = "RunSimulation";

	@SerializedName("SID")
	protected String sid;
	@SerializedName("candidate")
	protected String candidate;
	@SerializedName("candidateType")
	protected String candidateType;

	public RunSimulationMessage(String oid, String sid, String candidate, String candidateType) {
		super(TYPE_NAME, oid);
		this.sid = sid;
		this.candidate = candidate;
		this.candidateType = candidateType;
	}
	
	public RunSimulationMessage() {
		this.type = TYPE_NAME;
	}

	public String getSid() {
		return sid;
	}

	public String getCandidate() {
		return candidate;
	}
	
	public String getCandidateType() {
		return candidateType;
	}
}
