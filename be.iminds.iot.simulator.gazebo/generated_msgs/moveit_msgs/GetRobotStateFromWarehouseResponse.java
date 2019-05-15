package moveit_msgs;

public interface GetRobotStateFromWarehouseResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetRobotStateFromWarehouseResponse";
  static final java.lang.String _DEFINITION = "\nmoveit_msgs/RobotState state";
  moveit_msgs.RobotState getState();
  void setState(moveit_msgs.RobotState value);
}
