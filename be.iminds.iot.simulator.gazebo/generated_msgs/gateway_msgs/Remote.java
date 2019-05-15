package gateway_msgs;

public interface Remote extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/Remote";
  static final java.lang.String _DEFINITION = "# Rules list specifying interactions with a remote gateway.\n# Depending on the service, this gets used for either flips or pulls.\n\n# List of flip/pull rules\nRemoteRule[] remotes\n\n# if true, attempt to cancel an existing flip rather than creating it\nbool cancel\n\n---\n\n# Return a verbose error string to help with debugging if success fails.\n# Strings defined in gateway_msgs.ErrorCodes\nint8 result\nstring error_message\n\n";
}
