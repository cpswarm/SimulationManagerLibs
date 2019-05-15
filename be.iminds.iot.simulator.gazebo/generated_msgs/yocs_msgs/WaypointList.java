package yocs_msgs;

public interface WaypointList extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/WaypointList";
  static final java.lang.String _DEFINITION = "# Way points\n\nWaypoint[] waypoints\n";
  java.util.List<yocs_msgs.Waypoint> getWaypoints();
  void setWaypoints(java.util.List<yocs_msgs.Waypoint> value);
}
