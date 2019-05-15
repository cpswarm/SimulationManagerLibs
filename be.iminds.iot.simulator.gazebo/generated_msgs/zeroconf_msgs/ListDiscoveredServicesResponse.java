package zeroconf_msgs;

public interface ListDiscoveredServicesResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "zeroconf_msgs/ListDiscoveredServicesResponse";
  static final java.lang.String _DEFINITION = "zeroconf_msgs/DiscoveredService[] services";
  java.util.List<zeroconf_msgs.DiscoveredService> getServices();
  void setServices(java.util.List<zeroconf_msgs.DiscoveredService> value);
}
