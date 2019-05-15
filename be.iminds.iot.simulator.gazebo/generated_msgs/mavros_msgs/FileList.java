package mavros_msgs;

public interface FileList extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/FileList";
  static final java.lang.String _DEFINITION = "# FTP::List\n#\n# :success:\tindicates success end of request\n# :r_errno:\tremote errno if applicapable\n\nstring dir_path\n---\nmavros_msgs/FileEntry[] list\nbool success\nint32 r_errno\n";
}
