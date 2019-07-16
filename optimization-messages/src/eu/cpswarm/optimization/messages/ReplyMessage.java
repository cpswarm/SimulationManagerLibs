package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public abstract class ReplyMessage extends Message {


	@SerializedName("success")
	protected Boolean success;

	public ReplyMessage(String type, String oid, Boolean success) {
		super(type, oid);
		this.success = success;
	}
	
	public ReplyMessage() {

	}

	public Boolean getSuccess() {
		return success;
	}
}
