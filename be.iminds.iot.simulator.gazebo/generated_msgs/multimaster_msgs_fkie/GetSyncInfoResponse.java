package multimaster_msgs_fkie;

public interface GetSyncInfoResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs_fkie/GetSyncInfoResponse";
  static final java.lang.String _DEFINITION = "multimaster_msgs_fkie/SyncMasterInfo[] hosts";
  java.util.List<multimaster_msgs_fkie.SyncMasterInfo> getHosts();
  void setHosts(java.util.List<multimaster_msgs_fkie.SyncMasterInfo> value);
}
