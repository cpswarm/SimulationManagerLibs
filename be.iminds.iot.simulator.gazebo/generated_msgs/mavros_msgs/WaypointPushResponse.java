package mavros_msgs;

public interface WaypointPushResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/WaypointPushResponse";
  static final java.lang.String _DEFINITION = "bool success\nuint32 wp_transfered";
  boolean getSuccess();
  void setSuccess(boolean value);
  int getWpTransfered();
  void setWpTransfered(int value);
}
