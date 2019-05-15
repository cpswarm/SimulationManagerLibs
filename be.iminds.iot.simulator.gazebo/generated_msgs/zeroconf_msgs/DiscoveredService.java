package zeroconf_msgs;

public interface DiscoveredService extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "zeroconf_msgs/DiscoveredService";
  static final java.lang.String _DEFINITION = "#\n# Provides all the properties required for definition of a discovered \n# zeroconf service. Note that it contains rather alot more information\n# than that which is used to publish a zeroconf service.\n\n# Service Part\nstring name\nstring type\nstring domain\nstring description\n\n# Resolved part\nstring hostname\nstring[] ipv4_addresses\nstring[] ipv6_addresses\nint32 port\n\n# These are detailed variables that you should not normally need\n# and can be safely ignored in most circumstances (currently used\n# by the avahi implementation).\n\nuint32 cookie\nbool is_local\nbool our_own\nbool wide_area\nbool multicast\nbool cached\n\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getType();
  void setType(java.lang.String value);
  java.lang.String getDomain();
  void setDomain(java.lang.String value);
  java.lang.String getDescription();
  void setDescription(java.lang.String value);
  java.lang.String getHostname();
  void setHostname(java.lang.String value);
  java.util.List<java.lang.String> getIpv4Addresses();
  void setIpv4Addresses(java.util.List<java.lang.String> value);
  java.util.List<java.lang.String> getIpv6Addresses();
  void setIpv6Addresses(java.util.List<java.lang.String> value);
  int getPort();
  void setPort(int value);
  int getCookie();
  void setCookie(int value);
  boolean getIsLocal();
  void setIsLocal(boolean value);
  boolean getOurOwn();
  void setOurOwn(boolean value);
  boolean getWideArea();
  void setWideArea(boolean value);
  boolean getMulticast();
  void setMulticast(boolean value);
  boolean getCached();
  void setCached(boolean value);
}
