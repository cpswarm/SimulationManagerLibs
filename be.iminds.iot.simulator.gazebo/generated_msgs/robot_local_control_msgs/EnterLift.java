package robot_local_control_msgs;

public interface EnterLift extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/EnterLift";
  static final java.lang.String _DEFINITION = "# valid values: floor_0, floor_1\nstring floor";
  java.lang.String getFloor();
  void setFloor(java.lang.String value);
}
