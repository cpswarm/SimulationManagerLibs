package robotnik_fms_msgs;

public interface RobotContinueRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/RobotContinueRequest";
  static final java.lang.String _DEFINITION = "# Robot id to command\nint32 robot_id\n";
  int getRobotId();
  void setRobotId(int value);
}
