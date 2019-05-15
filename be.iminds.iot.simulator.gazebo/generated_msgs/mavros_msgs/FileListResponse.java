package mavros_msgs;

public interface FileListResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/FileListResponse";
  static final java.lang.String _DEFINITION = "mavros_msgs/FileEntry[] list\nbool success\nint32 r_errno";
  java.util.List<mavros_msgs.FileEntry> getList();
  void setList(java.util.List<mavros_msgs.FileEntry> value);
  boolean getSuccess();
  void setSuccess(boolean value);
  int getRErrno();
  void setRErrno(int value);
}
