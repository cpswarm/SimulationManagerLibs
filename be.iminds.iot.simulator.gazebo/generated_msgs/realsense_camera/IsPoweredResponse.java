package realsense_camera;

public interface IsPoweredResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "realsense_camera/IsPoweredResponse";
  static final java.lang.String _DEFINITION = "bool is_powered";
  boolean getIsPowered();
  void setIsPowered(boolean value);
}
