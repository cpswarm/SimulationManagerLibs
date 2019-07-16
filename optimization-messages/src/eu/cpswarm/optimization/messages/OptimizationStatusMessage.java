package eu.cpswarm.optimization.messages;

import com.google.gson.annotations.SerializedName;

public class OptimizationStatusMessage extends Message {
	public static final String TYPE_NAME = "OptimizationStatus";

	public enum Status {
		@SerializedName("ErrorBadConfiguration")  // optimization is not actived
		ERROR_BAD_CONFIGURATION,
		@SerializedName("Started")   // reply to StartOptimization when received in first time, maybe remove the OptimizationToolConfigured class  
		STARTED,
		@SerializedName("Running")   // running for some time, with a progress
		RUNNING,
		@SerializedName("ErrorOptimizationFailed")     // error appeared
		ERROR_OPTIMIZAZION_FAILED,
		@SerializedName("Cancelled")    //  request from SOO to cancel it without error, stopped
		CANCELLED,
		@SerializedName("Completed")
		COMPLETED
	}
	
	@SerializedName("status")
	protected Status operationStatus;

	@SerializedName("progress")
	protected double progress;
	@SerializedName("bestFitnessValue")
	protected double bestFitnessValue;
	@SerializedName("bestController")
	protected String bestController;
	
	public OptimizationStatusMessage(String oid, double progress, Status operationStatus, double bestFitnessValue, String bestController) {
		super(TYPE_NAME, oid);
		this.progress = progress;
		this.operationStatus = operationStatus;
		this.bestFitnessValue = bestFitnessValue;
		this.bestController = bestController;
	}
	
	public OptimizationStatusMessage() {
		this.type = TYPE_NAME;
	}
	
	public Status getOperationStatus() {
		return operationStatus;
	}
	
	public double getProgress() {
		return progress;
	}
	
	public double getBestFitnessValue() {
		return bestFitnessValue;
	}
	
	public String getBestController() {
		return bestController;
	}
}