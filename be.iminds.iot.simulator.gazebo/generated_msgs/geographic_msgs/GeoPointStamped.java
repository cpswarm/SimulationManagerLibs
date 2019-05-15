package geographic_msgs;

public interface GeoPointStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GeoPointStamped";
  static final java.lang.String _DEFINITION = "Header header\ngeographic_msgs/GeoPoint position\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geographic_msgs.GeoPoint getPosition();
  void setPosition(geographic_msgs.GeoPoint value);
}
