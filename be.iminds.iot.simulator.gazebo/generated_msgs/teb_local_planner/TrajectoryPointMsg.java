package teb_local_planner;

public interface TrajectoryPointMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "teb_local_planner/TrajectoryPointMsg";
  static final java.lang.String _DEFINITION = "# Message that contains single point on a trajectory suited for mobile navigation.\n# The trajectory is described by a sequence of poses, velocities,\n# accelerations and temporal information.\n\n# Why this message type?\n# nav_msgs/Path describes only a path without temporal information.\n# trajectory_msgs package contains only messages for joint trajectories.\n\n# The pose of the robot\ngeometry_msgs/Pose pose\n\n# Corresponding velocity\ngeometry_msgs/Twist velocity\n\n# Corresponding acceleration\ngeometry_msgs/Twist acceleration\n\nduration time_from_start\n\n\n\n";
  geometry_msgs.Pose getPose();
  void setPose(geometry_msgs.Pose value);
  geometry_msgs.Twist getVelocity();
  void setVelocity(geometry_msgs.Twist value);
  geometry_msgs.Twist getAcceleration();
  void setAcceleration(geometry_msgs.Twist value);
  org.ros.message.Duration getTimeFromStart();
  void setTimeFromStart(org.ros.message.Duration value);
}
