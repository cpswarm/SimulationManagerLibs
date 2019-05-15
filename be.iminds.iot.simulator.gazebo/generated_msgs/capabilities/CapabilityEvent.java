package capabilities;

public interface CapabilityEvent extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/CapabilityEvent";
  static final java.lang.String _DEFINITION = "Header header\n# Capability which this event pretains to\nstring capability\n# Capability provider which this event pretains to\nstring provider\n\n# Event types\nstring LAUNCHED=\"launched\"\nstring STOPPED=\"stopped\"\nstring TERMINATED=\"terminated\"\nstring SERVER_READY=\"server_ready\"\n# Event type\nstring type\n\n# PID of the related process\nint32 pid\n";
  static final java.lang.String LAUNCHED = "\"launched\"";
  static final java.lang.String STOPPED = "\"stopped\"";
  static final java.lang.String TERMINATED = "\"terminated\"";
  static final java.lang.String SERVER_READY = "\"server_ready\"";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.lang.String getCapability();
  void setCapability(java.lang.String value);
  java.lang.String getProvider();
  void setProvider(java.lang.String value);
  java.lang.String getType();
  void setType(java.lang.String value);
  int getPid();
  void setPid(int value);
}
