package robotnik_fms_msgs;

public interface PlannerRobotStatusArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/PlannerRobotStatusArray";
  static final java.lang.String _DEFINITION = "robotnik_fms_msgs/PlannerRobotStatus[] RobotsStatus\n";
  java.util.List<robotnik_fms_msgs.PlannerRobotStatus> getRobotsStatus();
  void setRobotsStatus(java.util.List<robotnik_fms_msgs.PlannerRobotStatus> value);
}
