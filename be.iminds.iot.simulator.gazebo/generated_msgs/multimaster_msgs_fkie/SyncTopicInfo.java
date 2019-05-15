package multimaster_msgs_fkie;

public interface SyncTopicInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs_fkie/SyncTopicInfo";
  static final java.lang.String _DEFINITION = "string topic\nstring node\nstring nodeuri";
  java.lang.String getTopic();
  void setTopic(java.lang.String value);
  java.lang.String getNode();
  void setNode(java.lang.String value);
  java.lang.String getNodeuri();
  void setNodeuri(java.lang.String value);
}
