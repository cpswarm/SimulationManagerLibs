package multimaster_msgs_fkie;

public interface DiscoverMastersResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs_fkie/DiscoverMastersResponse";
  static final java.lang.String _DEFINITION = "multimaster_msgs_fkie/ROSMaster[] masters";
  java.util.List<multimaster_msgs_fkie.ROSMaster> getMasters();
  void setMasters(java.util.List<multimaster_msgs_fkie.ROSMaster> value);
}
