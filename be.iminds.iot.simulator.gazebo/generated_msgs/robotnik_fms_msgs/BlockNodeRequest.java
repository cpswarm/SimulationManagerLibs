package robotnik_fms_msgs;

public interface BlockNodeRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/BlockNodeRequest";
  static final java.lang.String _DEFINITION = "int32[] node_id\nint32 robot_id\nbool block\nbool reserve\n";
  int[] getNodeId();
  void setNodeId(int[] value);
  int getRobotId();
  void setRobotId(int value);
  boolean getBlock();
  void setBlock(boolean value);
  boolean getReserve();
  void setReserve(boolean value);
}
