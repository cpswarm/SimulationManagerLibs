package gateway_msgs;

public interface Advertise extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/Advertise";
  static final java.lang.String _DEFINITION = "# if cancel is set, removes the list from the public interface\nbool cancel\nRule[] rules\n\n---\n\n# Return a verbose error string to help with debugging if success fails.\n# Strings defined in gateway_comms.msg.Result\nint8 result\nstring error_message\n\nRule[] watchlist\n";
}
