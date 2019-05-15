package multimaster_msgs_fkie;

public interface LoadLaunchRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs_fkie/LoadLaunchRequest";
  static final java.lang.String _DEFINITION = "string package\nstring file\nstring argv\n";
  java.lang.String getPackage();
  void setPackage(java.lang.String value);
  java.lang.String getFile();
  void setFile(java.lang.String value);
  java.lang.String getArgv();
  void setArgv(java.lang.String value);
}
