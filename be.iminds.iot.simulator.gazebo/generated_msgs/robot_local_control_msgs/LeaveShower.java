package robot_local_control_msgs;

public interface LeaveShower extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/LeaveShower";
  static final java.lang.String _DEFINITION = "# valid values: warehouse, production\nstring from\n# valid values: left, right, as seen from warehouse side\nstring door\n";
  java.lang.String getFrom();
  void setFrom(java.lang.String value);
  java.lang.String getDoor();
  void setDoor(java.lang.String value);
}
