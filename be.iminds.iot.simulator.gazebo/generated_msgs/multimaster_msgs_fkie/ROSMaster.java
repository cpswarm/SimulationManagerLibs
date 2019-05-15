package multimaster_msgs_fkie;

public interface ROSMaster extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs_fkie/ROSMaster";
  static final java.lang.String _DEFINITION = "string name\n# ROS Master URI\nstring uri\n# The timestamp of the state of the remoter ROS master\nfloat64 timestamp\n# The timestamp of the state of the remoter ROS master, without the changes maked while a synchronization.\nfloat64 timestamp_local\nbool online\nstring discoverer_name\nstring monitoruri";
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getUri();
  void setUri(java.lang.String value);
  double getTimestamp();
  void setTimestamp(double value);
  double getTimestampLocal();
  void setTimestampLocal(double value);
  boolean getOnline();
  void setOnline(boolean value);
  java.lang.String getDiscovererName();
  void setDiscovererName(java.lang.String value);
  java.lang.String getMonitoruri();
  void setMonitoruri(java.lang.String value);
}
