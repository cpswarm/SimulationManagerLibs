package gateway_msgs;

public interface RemoteAll extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/RemoteAll";
  static final java.lang.String _DEFINITION = "# Flips all except a blacklist to the specified target\n\n# The target recipient of the flip\nstring gateway\n\n# list of connections to exclude, this will be added to the default blacklist\nRule[] blacklist\n\n# if cancel is set, stops flipping all connections\nbool cancel\n\n---\n\n# Return a verbose error string to help with debugging if success fails.\n# Strings defined in gateway_comms.msg.Result\nint8 result\nstring error_message\n\n";
}
