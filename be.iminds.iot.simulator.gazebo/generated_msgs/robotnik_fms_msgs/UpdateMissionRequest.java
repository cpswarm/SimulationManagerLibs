package robotnik_fms_msgs;

public interface UpdateMissionRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/UpdateMissionRequest";
  static final java.lang.String _DEFINITION = "int32 id_mission\nint32 id_robot\nstring msg\n";
  int getIdMission();
  void setIdMission(int value);
  int getIdRobot();
  void setIdRobot(int value);
  java.lang.String getMsg();
  void setMsg(java.lang.String value);
}
