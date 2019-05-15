package robotnik_fms_msgs;

public interface GetBlockedNodeRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/GetBlockedNodeRequest";
  static final java.lang.String _DEFINITION = "int32[] node_id\nint32 robot_id\n";
  int[] getNodeId();
  void setNodeId(int[] value);
  int getRobotId();
  void setRobotId(int value);
}
