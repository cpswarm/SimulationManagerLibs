package mavros_msgs;

public interface WaypointReached extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/WaypointReached";
  static final java.lang.String _DEFINITION = "# That message represent MISSION_ITEM_REACHED\n#\n#   :wp_seq:    index number of reached waypoint\n\nHeader header\n\nuint16 wp_seq\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  short getWpSeq();
  void setWpSeq(short value);
}
