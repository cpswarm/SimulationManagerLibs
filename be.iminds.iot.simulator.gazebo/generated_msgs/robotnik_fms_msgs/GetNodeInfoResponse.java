package robotnik_fms_msgs;

public interface GetNodeInfoResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/GetNodeInfoResponse";
  static final java.lang.String _DEFINITION = "robotnik_fms_msgs/NodeInfo node_info\nbool ret\nstring msg";
  robotnik_fms_msgs.NodeInfo getNodeInfo();
  void setNodeInfo(robotnik_fms_msgs.NodeInfo value);
  boolean getRet();
  void setRet(boolean value);
  java.lang.String getMsg();
  void setMsg(java.lang.String value);
}
