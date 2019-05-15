package geographic_msgs;

public interface GeoPath extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GeoPath";
  static final java.lang.String _DEFINITION = "std_msgs/Header header\ngeographic_msgs/GeoPoseStamped[] poses\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<geographic_msgs.GeoPoseStamped> getPoses();
  void setPoses(java.util.List<geographic_msgs.GeoPoseStamped> value);
}
