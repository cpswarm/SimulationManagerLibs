package mavros_msgs;

public interface FileReadRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/FileReadRequest";
  static final java.lang.String _DEFINITION = "# FTP::Read\n#\n# Call FTP::Open first.\n# :success:\tindicates success end of request\n# :r_errno:\tremote errno if applicapable\n\nstring file_path\nuint64 offset\nuint64 size\n";
  java.lang.String getFilePath();
  void setFilePath(java.lang.String value);
  long getOffset();
  void setOffset(long value);
  long getSize();
  void setSize(long value);
}
