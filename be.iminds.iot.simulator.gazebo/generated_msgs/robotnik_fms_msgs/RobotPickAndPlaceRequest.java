package robotnik_fms_msgs;

public interface RobotPickAndPlaceRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/RobotPickAndPlaceRequest";
  static final java.lang.String _DEFINITION = "# Robot id to command\nint32 robot_id\nint32 pick_from\nint32 place_to\n";
  int getRobotId();
  void setRobotId(int value);
  int getPickFrom();
  void setPickFrom(int value);
  int getPlaceTo();
  void setPlaceTo(int value);
}
