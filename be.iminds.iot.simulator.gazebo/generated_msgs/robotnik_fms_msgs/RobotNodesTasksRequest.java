package robotnik_fms_msgs;

public interface RobotNodesTasksRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/RobotNodesTasksRequest";
  static final java.lang.String _DEFINITION = "int32 robot\nint32 mission\nint32[] node_origin\nstring action_origin\nint32[] node_dest\nstring action_dest\nstring planner_status\nbool error_ack\nstring msg\n";
  int getRobot();
  void setRobot(int value);
  int getMission();
  void setMission(int value);
  int[] getNodeOrigin();
  void setNodeOrigin(int[] value);
  java.lang.String getActionOrigin();
  void setActionOrigin(java.lang.String value);
  int[] getNodeDest();
  void setNodeDest(int[] value);
  java.lang.String getActionDest();
  void setActionDest(java.lang.String value);
  java.lang.String getPlannerStatus();
  void setPlannerStatus(java.lang.String value);
  boolean getErrorAck();
  void setErrorAck(boolean value);
  java.lang.String getMsg();
  void setMsg(java.lang.String value);
}
