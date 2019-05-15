package multimaster_msgs_fkie;

public interface SyncServiceInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs_fkie/SyncServiceInfo";
  static final java.lang.String _DEFINITION = "string service\nstring serviceuri\nstring node\nstring nodeuri";
  java.lang.String getService();
  void setService(java.lang.String value);
  java.lang.String getServiceuri();
  void setServiceuri(java.lang.String value);
  java.lang.String getNode();
  void setNode(java.lang.String value);
  java.lang.String getNodeuri();
  void setNodeuri(java.lang.String value);
}
