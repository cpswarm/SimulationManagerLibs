package mavros_msgs;

public interface FileReadResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/FileReadResponse";
  static final java.lang.String _DEFINITION = "uint8[] data\nbool success\nint32 r_errno";
  org.jboss.netty.buffer.ChannelBuffer getData();
  void setData(org.jboss.netty.buffer.ChannelBuffer value);
  boolean getSuccess();
  void setSuccess(boolean value);
  int getRErrno();
  void setRErrno(int value);
}
