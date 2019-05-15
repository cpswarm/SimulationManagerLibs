package mavros_msgs;

public interface FileRemoveRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/FileRemoveRequest";
  static final java.lang.String _DEFINITION = "# FTP::Remove\n#\n# :success:\tindicates success end of request\n# :r_errno:\tremote errno if applicapable\n\nstring file_path\n";
  java.lang.String getFilePath();
  void setFilePath(java.lang.String value);
}
