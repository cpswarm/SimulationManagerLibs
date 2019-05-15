package mavros_msgs;

public interface WaypointPushRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/WaypointPushRequest";
  static final java.lang.String _DEFINITION = "# Send waypoints to device\n#\n#  :start_index: will define a partial waypoint update. Set to 0 for full update\n#\n# Returns success status and transfered count\n\nuint16 start_index\nmavros_msgs/Waypoint[] waypoints\n";
  short getStartIndex();
  void setStartIndex(short value);
  java.util.List<mavros_msgs.Waypoint> getWaypoints();
  void setWaypoints(java.util.List<mavros_msgs.Waypoint> value);
}
