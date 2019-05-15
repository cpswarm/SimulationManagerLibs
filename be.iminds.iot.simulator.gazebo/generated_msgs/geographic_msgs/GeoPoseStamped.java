package geographic_msgs;

public interface GeoPoseStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GeoPoseStamped";
  static final java.lang.String _DEFINITION = "Header header\ngeographic_msgs/GeoPose pose\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geographic_msgs.GeoPose getPose();
  void setPose(geographic_msgs.GeoPose value);
}
