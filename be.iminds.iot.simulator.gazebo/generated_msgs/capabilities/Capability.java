package capabilities;

public interface Capability extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/Capability";
  static final java.lang.String _DEFINITION = "# Capability\nstring capability\n# Used provider\nstring provider\n";
  java.lang.String getCapability();
  void setCapability(java.lang.String value);
  java.lang.String getProvider();
  void setProvider(java.lang.String value);
}
