package capabilities;

public interface StopCapabilityRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/StopCapabilityRequest";
  static final java.lang.String _DEFINITION = "string capability\n";
  java.lang.String getCapability();
  void setCapability(java.lang.String value);
}
