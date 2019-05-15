package rocon_std_msgs;

public interface Icon extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_std_msgs/Icon";
  static final java.lang.String _DEFINITION = "# Used to idenfity the original package/filename resource this icon was/is to be loaded from\n# This typically doesn\'t have to be set, but can be very useful when loading icons from yaml definitions.\nstring resource_name\n\n# Image data format.  \"jpeg\" or \"png\"\nstring format\n\n# Image data.\nuint8[] data";
  java.lang.String getResourceName();
  void setResourceName(java.lang.String value);
  java.lang.String getFormat();
  void setFormat(java.lang.String value);
  org.jboss.netty.buffer.ChannelBuffer getData();
  void setData(org.jboss.netty.buffer.ChannelBuffer value);
}
