package realsense_camera;

public interface SetPower extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "realsense_camera/SetPower";
  static final java.lang.String _DEFINITION = "bool power_on         # true - to power on camera, false - to power off camera\n---\nbool success          # false - only if camera has subscribers, and attempted power off\n";
}
