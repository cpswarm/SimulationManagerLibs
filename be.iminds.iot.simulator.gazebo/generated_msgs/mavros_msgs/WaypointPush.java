package mavros_msgs;

public interface WaypointPush extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/WaypointPush";
  static final java.lang.String _DEFINITION = "# Send waypoints to device\n#\n#  :start_index: will define a partial waypoint update. Set to 0 for full update\n#\n# Returns success status and transfered count\n\nuint16 start_index\nmavros_msgs/Waypoint[] waypoints\n---\nbool success\nuint32 wp_transfered\n";
}
