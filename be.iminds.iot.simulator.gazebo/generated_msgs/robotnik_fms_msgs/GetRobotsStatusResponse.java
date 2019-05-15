package robotnik_fms_msgs;

public interface GetRobotsStatusResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/GetRobotsStatusResponse";
  static final java.lang.String _DEFINITION = "robotnik_fms_msgs/PlannerRobotStatus[] robot_status\nbool ret\nstring msg";
  java.util.List<robotnik_fms_msgs.PlannerRobotStatus> getRobotStatus();
  void setRobotStatus(java.util.List<robotnik_fms_msgs.PlannerRobotStatus> value);
  boolean getRet();
  void setRet(boolean value);
  java.lang.String getMsg();
  void setMsg(java.lang.String value);
}
