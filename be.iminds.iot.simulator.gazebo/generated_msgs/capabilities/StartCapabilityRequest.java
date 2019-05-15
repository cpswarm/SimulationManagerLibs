package capabilities;

public interface StartCapabilityRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/StartCapabilityRequest";
  static final java.lang.String _DEFINITION = "string capability\nstring preferred_provider\n";
  java.lang.String getCapability();
  void setCapability(java.lang.String value);
  java.lang.String getPreferredProvider();
  void setPreferredProvider(java.lang.String value);
}
