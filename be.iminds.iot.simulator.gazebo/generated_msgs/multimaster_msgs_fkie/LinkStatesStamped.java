package multimaster_msgs_fkie;

public interface LinkStatesStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs_fkie/LinkStatesStamped";
  static final java.lang.String _DEFINITION = "Header header\nmultimaster_msgs_fkie/LinkState[] links";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<multimaster_msgs_fkie.LinkState> getLinks();
  void setLinks(java.util.List<multimaster_msgs_fkie.LinkState> value);
}
