package multimaster_msgs_fkie;

public interface ListNodesResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs_fkie/ListNodesResponse";
  static final java.lang.String _DEFINITION = "string[] nodes";
  java.util.List<java.lang.String> getNodes();
  void setNodes(java.util.List<java.lang.String> value);
}
