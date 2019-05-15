package robot_local_control_msgs;

public interface Dock extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/Dock";
  static final java.lang.String _DEFINITION = "string dock_frame\nstring robot_dock_frame\ngeometry_msgs/Pose2D dock_offset\ngeometry_msgs/Twist maximum_velocity\n\n";
  java.lang.String getDockFrame();
  void setDockFrame(java.lang.String value);
  java.lang.String getRobotDockFrame();
  void setRobotDockFrame(java.lang.String value);
  geometry_msgs.Pose2D getDockOffset();
  void setDockOffset(geometry_msgs.Pose2D value);
  geometry_msgs.Twist getMaximumVelocity();
  void setMaximumVelocity(geometry_msgs.Twist value);
}
