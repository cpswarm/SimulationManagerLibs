package mavros_msgs;

public interface FileTruncateRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/FileTruncateRequest";
  static final java.lang.String _DEFINITION = "# FTP::Truncate\n#\n# :success:\tindicates success end of request\n# :r_errno:\tremote errno if applicapable\n\nstring file_path\nuint64 length\n";
  java.lang.String getFilePath();
  void setFilePath(java.lang.String value);
  long getLength();
  void setLength(long value);
}
