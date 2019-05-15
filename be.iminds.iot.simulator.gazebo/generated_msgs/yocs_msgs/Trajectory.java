package yocs_msgs;

public interface Trajectory extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/Trajectory";
  static final java.lang.String _DEFINITION = "# A named list of way points\nHeader header\nstring name\nWaypoint[] waypoints\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.lang.String getName();
  void setName(java.lang.String value);
  java.util.List<yocs_msgs.Waypoint> getWaypoints();
  void setWaypoints(java.util.List<yocs_msgs.Waypoint> value);
}
