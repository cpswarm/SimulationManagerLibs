package robot_local_control_msgs;

public interface Move extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/Move";
  static final java.lang.String _DEFINITION = "geometry_msgs/Pose2D goal\ngeometry_msgs/Twist maximum_velocity\n";
  geometry_msgs.Pose2D getGoal();
  void setGoal(geometry_msgs.Pose2D value);
  geometry_msgs.Twist getMaximumVelocity();
  void setMaximumVelocity(geometry_msgs.Twist value);
}
