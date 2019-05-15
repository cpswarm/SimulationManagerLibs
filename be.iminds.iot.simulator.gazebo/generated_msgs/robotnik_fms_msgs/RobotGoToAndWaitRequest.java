package robotnik_fms_msgs;

public interface RobotGoToAndWaitRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/RobotGoToAndWaitRequest";
  static final java.lang.String _DEFINITION = "# Robot id to command\nint32 robot_id\n# List of goals \nint32[] goals\n";
  int getRobotId();
  void setRobotId(int value);
  int[] getGoals();
  void setGoals(int[] value);
}
