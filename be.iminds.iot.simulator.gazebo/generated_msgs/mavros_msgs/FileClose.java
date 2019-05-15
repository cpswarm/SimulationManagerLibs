package mavros_msgs;

public interface FileClose extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/FileClose";
  static final java.lang.String _DEFINITION = "# FTP::Close\n#\n# Call FTP::Open first.\n# :success:\tindicates success end of request\n# :r_errno:\tremote errno if applicapable\n\nstring file_path\n---\nbool success\nint32 r_errno\n";
}
