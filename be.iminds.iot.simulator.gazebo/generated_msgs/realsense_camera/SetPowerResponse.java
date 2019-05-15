package realsense_camera;

public interface SetPowerResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "realsense_camera/SetPowerResponse";
  static final java.lang.String _DEFINITION = "bool success          # false - only if camera has subscribers, and attempted power off";
  boolean getSuccess();
  void setSuccess(boolean value);
}
