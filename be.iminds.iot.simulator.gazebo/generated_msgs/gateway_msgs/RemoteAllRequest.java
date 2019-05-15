package gateway_msgs;

public interface RemoteAllRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/RemoteAllRequest";
  static final java.lang.String _DEFINITION = "# Flips all except a blacklist to the specified target\n\n# The target recipient of the flip\nstring gateway\n\n# list of connections to exclude, this will be added to the default blacklist\nRule[] blacklist\n\n# if cancel is set, stops flipping all connections\nbool cancel\n\n";
  java.lang.String getGateway();
  void setGateway(java.lang.String value);
  java.util.List<gateway_msgs.Rule> getBlacklist();
  void setBlacklist(java.util.List<gateway_msgs.Rule> value);
  boolean getCancel();
  void setCancel(boolean value);
}
