package gateway_msgs;

public interface AdvertiseRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/AdvertiseRequest";
  static final java.lang.String _DEFINITION = "# if cancel is set, removes the list from the public interface\nbool cancel\nRule[] rules\n\n";
  boolean getCancel();
  void setCancel(boolean value);
  java.util.List<gateway_msgs.Rule> getRules();
  void setRules(java.util.List<gateway_msgs.Rule> value);
}
