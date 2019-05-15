package robot_local_control_msgs;

public interface SimpleGoToWithValidationRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/SimpleGoToWithValidationRequest";
  static final java.lang.String _DEFINITION = "float32 max_velocity\nbool validation\nstring command\ngeometry_msgs/Pose2D goal\n";
  float getMaxVelocity();
  void setMaxVelocity(float value);
  boolean getValidation();
  void setValidation(boolean value);
  java.lang.String getCommand();
  void setCommand(java.lang.String value);
  geometry_msgs.Pose2D getGoal();
  void setGoal(geometry_msgs.Pose2D value);
}
