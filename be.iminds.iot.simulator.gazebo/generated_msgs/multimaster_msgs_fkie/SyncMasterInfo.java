package multimaster_msgs_fkie;

public interface SyncMasterInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs_fkie/SyncMasterInfo";
  static final java.lang.String _DEFINITION = "string masteruri\nstring[] nodes\nmultimaster_msgs_fkie/SyncTopicInfo[] publisher\nmultimaster_msgs_fkie/SyncTopicInfo[] subscriber\nmultimaster_msgs_fkie/SyncServiceInfo[] services";
  java.lang.String getMasteruri();
  void setMasteruri(java.lang.String value);
  java.util.List<java.lang.String> getNodes();
  void setNodes(java.util.List<java.lang.String> value);
  java.util.List<multimaster_msgs_fkie.SyncTopicInfo> getPublisher();
  void setPublisher(java.util.List<multimaster_msgs_fkie.SyncTopicInfo> value);
  java.util.List<multimaster_msgs_fkie.SyncTopicInfo> getSubscriber();
  void setSubscriber(java.util.List<multimaster_msgs_fkie.SyncTopicInfo> value);
  java.util.List<multimaster_msgs_fkie.SyncServiceInfo> getServices();
  void setServices(java.util.List<multimaster_msgs_fkie.SyncServiceInfo> value);
}
