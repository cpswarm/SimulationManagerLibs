package realsense_camera;

public interface ForcePowerRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "realsense_camera/ForcePowerRequest";
  static final java.lang.String _DEFINITION = "bool power_on         # true - to power on camera, false - to power off camera\n";
  boolean getPowerOn();
  void setPowerOn(boolean value);
}
