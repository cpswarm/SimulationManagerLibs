package zeroconf_msgs;

public interface AddServiceRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "zeroconf_msgs/AddServiceRequest";
  static final java.lang.String _DEFINITION = "zeroconf_msgs/PublishedService service\n";
  zeroconf_msgs.PublishedService getService();
  void setService(zeroconf_msgs.PublishedService value);
}
