package capabilities;

public interface RunningCapability extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/RunningCapability";
  static final java.lang.String _DEFINITION = "# Name and provider of this running capability\nCapability capability\n# Capabilities which depend on this one\nCapability[] dependent_capabilities\n# Message stating what started this capability\nstring started_by\n# Process ID of the running provider\nint32 pid\n";
  capabilities.Capability getCapability();
  void setCapability(capabilities.Capability value);
  java.util.List<capabilities.Capability> getDependentCapabilities();
  void setDependentCapabilities(java.util.List<capabilities.Capability> value);
  java.lang.String getStartedBy();
  void setStartedBy(java.lang.String value);
  int getPid();
  void setPid(int value);
}
