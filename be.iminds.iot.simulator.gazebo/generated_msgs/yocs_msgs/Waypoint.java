package yocs_msgs;

public interface Waypoint extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/Waypoint";
  static final java.lang.String _DEFINITION = "Header header\nstring name\ngeometry_msgs/Pose pose\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.lang.String getName();
  void setName(java.lang.String value);
  geometry_msgs.Pose getPose();
  void setPose(geometry_msgs.Pose value);
}
