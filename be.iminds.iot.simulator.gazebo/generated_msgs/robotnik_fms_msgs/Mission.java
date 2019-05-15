package robotnik_fms_msgs;

public interface Mission extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/Mission";
  static final java.lang.String _DEFINITION = "int32 id\nint32 robot_id\nbool charge\nbool load\nbool unload\nbool canceled\nstring error_msg\nint32[] node_or\nint32[] node_dest\nstring node_or_action\nstring node_dest_action\nstring time_start\nstring time_insert\nstring time_end\n";
  int getId();
  void setId(int value);
  int getRobotId();
  void setRobotId(int value);
  boolean getCharge();
  void setCharge(boolean value);
  boolean getLoad();
  void setLoad(boolean value);
  boolean getUnload();
  void setUnload(boolean value);
  boolean getCanceled();
  void setCanceled(boolean value);
  java.lang.String getErrorMsg();
  void setErrorMsg(java.lang.String value);
  int[] getNodeOr();
  void setNodeOr(int[] value);
  int[] getNodeDest();
  void setNodeDest(int[] value);
  java.lang.String getNodeOrAction();
  void setNodeOrAction(java.lang.String value);
  java.lang.String getNodeDestAction();
  void setNodeDestAction(java.lang.String value);
  java.lang.String getTimeStart();
  void setTimeStart(java.lang.String value);
  java.lang.String getTimeInsert();
  void setTimeInsert(java.lang.String value);
  java.lang.String getTimeEnd();
  void setTimeEnd(java.lang.String value);
}
