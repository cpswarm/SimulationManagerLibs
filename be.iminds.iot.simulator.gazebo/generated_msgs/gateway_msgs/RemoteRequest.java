package gateway_msgs;

public interface RemoteRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/RemoteRequest";
  static final java.lang.String _DEFINITION = "# Rules list specifying interactions with a remote gateway.\n# Depending on the service, this gets used for either flips or pulls.\n\n# List of flip/pull rules\nRemoteRule[] remotes\n\n# if true, attempt to cancel an existing flip rather than creating it\nbool cancel\n\n";
  java.util.List<gateway_msgs.RemoteRule> getRemotes();
  void setRemotes(java.util.List<gateway_msgs.RemoteRule> value);
  boolean getCancel();
  void setCancel(boolean value);
}
