package robotnik_fms_msgs;

public interface RobotCancelRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/RobotCancelRequest";
  static final java.lang.String _DEFINITION = "# Robot id to command\nint32 robot_id\n";
  int getRobotId();
  void setRobotId(int value);
}
