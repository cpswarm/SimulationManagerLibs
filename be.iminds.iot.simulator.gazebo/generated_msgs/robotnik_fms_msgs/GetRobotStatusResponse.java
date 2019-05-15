package robotnik_fms_msgs;

public interface GetRobotStatusResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/GetRobotStatusResponse";
  static final java.lang.String _DEFINITION = "robotnik_fms_msgs/RobotStatus robot_status\nrobot_local_control_msgs/Status rlc_status\nbool rlc_connected\nbool ret\nstring msg";
  robotnik_fms_msgs.RobotStatus getRobotStatus();
  void setRobotStatus(robotnik_fms_msgs.RobotStatus value);
  robot_local_control_msgs.Status getRlcStatus();
  void setRlcStatus(robot_local_control_msgs.Status value);
  boolean getRlcConnected();
  void setRlcConnected(boolean value);
  boolean getRet();
  void setRet(boolean value);
  java.lang.String getMsg();
  void setMsg(java.lang.String value);
}
