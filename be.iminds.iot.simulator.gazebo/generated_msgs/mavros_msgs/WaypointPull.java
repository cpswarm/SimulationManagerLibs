package mavros_msgs;

public interface WaypointPull extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/WaypointPull";
  static final java.lang.String _DEFINITION = "# Requests waypoints from device\n#\n# Returns success status and received count\n\n---\nbool success\nuint32 wp_received\n";
}
