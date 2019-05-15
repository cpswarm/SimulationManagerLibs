package gateway_msgs;

public interface AdvertiseAll extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/AdvertiseAll";
  static final java.lang.String _DEFINITION = "# if cancel is set, stops advertising all connections\nbool cancel\nRule[] blacklist\n\n---\n\n# Return a verbose error string to help with debugging if success fails.\n# Strings defined in gateway_comms.msg.Result\nint8 result\nstring error_message\n\nRule[] blacklist\n";
}
