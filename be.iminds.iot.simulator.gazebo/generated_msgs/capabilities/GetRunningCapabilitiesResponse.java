package capabilities;

public interface GetRunningCapabilitiesResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/GetRunningCapabilitiesResponse";
  static final java.lang.String _DEFINITION = "RunningCapability[] running_capabilities";
  java.util.List<capabilities.RunningCapability> getRunningCapabilities();
  void setRunningCapabilities(java.util.List<capabilities.RunningCapability> value);
}
