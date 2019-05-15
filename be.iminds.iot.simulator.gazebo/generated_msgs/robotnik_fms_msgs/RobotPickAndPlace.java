package robotnik_fms_msgs;

public interface RobotPickAndPlace extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/RobotPickAndPlace";
  static final java.lang.String _DEFINITION = "# Robot id to command\nint32 robot_id\nint32 pick_from\nint32 place_to\n---\nbool success\nstring message\nint32 id\n";
}
