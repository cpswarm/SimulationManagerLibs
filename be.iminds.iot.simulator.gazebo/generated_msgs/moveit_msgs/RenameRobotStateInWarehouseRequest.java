package moveit_msgs;

public interface RenameRobotStateInWarehouseRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/RenameRobotStateInWarehouseRequest";
  static final java.lang.String _DEFINITION = "string old_name\nstring new_name\nstring robot\n";
  java.lang.String getOldName();
  void setOldName(java.lang.String value);
  java.lang.String getNewName();
  void setNewName(java.lang.String value);
  java.lang.String getRobot();
  void setRobot(java.lang.String value);
}
