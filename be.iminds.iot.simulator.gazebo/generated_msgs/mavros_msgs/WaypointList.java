package mavros_msgs;

public interface WaypointList extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/WaypointList";
  static final java.lang.String _DEFINITION = "# WaypointList.msg\n#\n#  :current_seq:   seq nr of currently active waypoint\n#                  waypoints[current_seq].is_current == True\n#\n#  :waypoints:     list of waypoints\n\nuint16 current_seq\nmavros_msgs/Waypoint[] waypoints\n";
  short getCurrentSeq();
  void setCurrentSeq(short value);
  java.util.List<mavros_msgs.Waypoint> getWaypoints();
  void setWaypoints(java.util.List<mavros_msgs.Waypoint> value);
}
