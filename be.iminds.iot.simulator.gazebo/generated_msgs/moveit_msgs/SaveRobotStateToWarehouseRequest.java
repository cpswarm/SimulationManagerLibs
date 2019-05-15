package moveit_msgs;

public interface SaveRobotStateToWarehouseRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/SaveRobotStateToWarehouseRequest";
  static final java.lang.String _DEFINITION = "string name\nstring robot\nmoveit_msgs/RobotState state\n\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getRobot();
  void setRobot(java.lang.String value);
  moveit_msgs.RobotState getState();
  void setState(moveit_msgs.RobotState value);
}
