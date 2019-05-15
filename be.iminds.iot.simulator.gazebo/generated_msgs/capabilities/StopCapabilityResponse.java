package capabilities;

public interface StopCapabilityResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/StopCapabilityResponse";
  static final java.lang.String _DEFINITION = "bool successful";
  boolean getSuccessful();
  void setSuccessful(boolean value);
}
