package zeroconf_msgs;

public interface ListPublishedServicesResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "zeroconf_msgs/ListPublishedServicesResponse";
  static final java.lang.String _DEFINITION = "zeroconf_msgs/PublishedService[] services";
  java.util.List<zeroconf_msgs.PublishedService> getServices();
  void setServices(java.util.List<zeroconf_msgs.PublishedService> value);
}
