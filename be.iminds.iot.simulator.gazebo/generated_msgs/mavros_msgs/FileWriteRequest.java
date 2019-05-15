package mavros_msgs;

public interface FileWriteRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/FileWriteRequest";
  static final java.lang.String _DEFINITION = "# FTP::Write\n#\n# Call FTP::Open first.\n# :success:\tindicates success end of request\n# :r_errno:\tremote errno if applicapable\n\nstring file_path\nuint64 offset\nuint8[] data\n";
  java.lang.String getFilePath();
  void setFilePath(java.lang.String value);
  long getOffset();
  void setOffset(long value);
  org.jboss.netty.buffer.ChannelBuffer getData();
  void setData(org.jboss.netty.buffer.ChannelBuffer value);
}
