package gateway_msgs;

public interface ConnectHubRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/ConnectHubRequest";
  static final java.lang.String _DEFINITION = "# Use to make connections to the hub.\n\nstring uri\n";
  java.lang.String getUri();
  void setUri(java.lang.String value);
}
