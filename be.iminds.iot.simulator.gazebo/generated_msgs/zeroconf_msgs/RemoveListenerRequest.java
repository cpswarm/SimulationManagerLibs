package zeroconf_msgs;

public interface RemoveListenerRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "zeroconf_msgs/RemoveListenerRequest";
  static final java.lang.String _DEFINITION = "string service_type\n";
  java.lang.String getServiceType();
  void setServiceType(java.lang.String value);
}
