package gateway_msgs;

public interface ConnectHub extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/ConnectHub";
  static final java.lang.String _DEFINITION = "# Use to make connections to the hub.\n\nstring uri\n---\n# Return a verbose error string to help with debugging if success fails.\n# Strings defined in gateway_comms.msg.Result\nint8 result\nstring error_message\n\n";
}
