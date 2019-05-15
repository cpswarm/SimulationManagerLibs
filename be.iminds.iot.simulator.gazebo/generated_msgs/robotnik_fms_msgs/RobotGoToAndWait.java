package robotnik_fms_msgs;

public interface RobotGoToAndWait extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/RobotGoToAndWait";
  static final java.lang.String _DEFINITION = "# Robot id to command\nint32 robot_id\n# List of goals \nint32[] goals\n---\nbool success\nstring message\nint32 id\n";
}
