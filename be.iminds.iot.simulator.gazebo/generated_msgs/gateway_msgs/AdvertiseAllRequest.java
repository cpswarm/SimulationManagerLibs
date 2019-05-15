package gateway_msgs;

public interface AdvertiseAllRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/AdvertiseAllRequest";
  static final java.lang.String _DEFINITION = "# if cancel is set, stops advertising all connections\nbool cancel\nRule[] blacklist\n\n";
  boolean getCancel();
  void setCancel(boolean value);
  java.util.List<gateway_msgs.Rule> getBlacklist();
  void setBlacklist(java.util.List<gateway_msgs.Rule> value);
}
