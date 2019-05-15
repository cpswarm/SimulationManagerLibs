package robot_local_control_msgs;

public interface GoTo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/GoTo";
  static final java.lang.String _DEFINITION = "# goals is a set of 2D poses that will be reached by the robot\nPose2DStamped[] goals\n# twist can be either empty, in that case no maximum velocity is\n# specified, or a set of the same size as goals, in which each goal\n# will be reached with its maximum velocity\nTwist2D[] max_velocities\n";
  java.util.List<robot_local_control_msgs.Pose2DStamped> getGoals();
  void setGoals(java.util.List<robot_local_control_msgs.Pose2DStamped> value);
  java.util.List<robot_local_control_msgs.Twist2D> getMaxVelocities();
  void setMaxVelocities(java.util.List<robot_local_control_msgs.Twist2D> value);
}
