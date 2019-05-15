package mavros_msgs;

public interface FileChecksumResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/FileChecksumResponse";
  static final java.lang.String _DEFINITION = "uint32 crc32\nbool success\nint32 r_errno";
  int getCrc32();
  void setCrc32(int value);
  boolean getSuccess();
  void setSuccess(boolean value);
  int getRErrno();
  void setRErrno(int value);
}
