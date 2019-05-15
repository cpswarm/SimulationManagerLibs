package realsense_camera;

public interface CameraConfigurationResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "realsense_camera/CameraConfigurationResponse";
  static final java.lang.String _DEFINITION = "string configuration_str";
  java.lang.String getConfigurationStr();
  void setConfigurationStr(java.lang.String value);
}
