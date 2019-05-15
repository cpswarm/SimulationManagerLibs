package robotnik_fms_msgs;

public interface ReloadGraphRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/ReloadGraphRequest";
  static final java.lang.String _DEFINITION = "# file to load (optional)\nstring file\n";
  java.lang.String getFile();
  void setFile(java.lang.String value);
}
