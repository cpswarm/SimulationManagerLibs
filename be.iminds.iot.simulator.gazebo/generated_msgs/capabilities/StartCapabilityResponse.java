package capabilities;

public interface StartCapabilityResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/StartCapabilityResponse";
  static final java.lang.String _DEFINITION = "bool successful";
  boolean getSuccessful();
  void setSuccessful(boolean value);
}
