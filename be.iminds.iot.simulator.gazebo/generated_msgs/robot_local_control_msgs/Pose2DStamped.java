package robot_local_control_msgs;

public interface Pose2DStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/Pose2DStamped";
  static final java.lang.String _DEFINITION = "Header header\ngeometry_msgs/Pose2D pose\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Pose2D getPose();
  void setPose(geometry_msgs.Pose2D value);
}
