package zeroconf_msgs;

public interface PublishedService extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "zeroconf_msgs/PublishedService";
  static final java.lang.String _DEFINITION = "#\n# Provides all the properties required for publishing of a zeroconf service.\n\nstring name\nstring type\nstring domain\nint32 port\nstring description\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getType();
  void setType(java.lang.String value);
  java.lang.String getDomain();
  void setDomain(java.lang.String value);
  int getPort();
  void setPort(int value);
  java.lang.String getDescription();
  void setDescription(java.lang.String value);
}
