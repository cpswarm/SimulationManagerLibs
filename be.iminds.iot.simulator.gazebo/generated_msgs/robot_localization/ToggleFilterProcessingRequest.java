package robot_localization;

public interface ToggleFilterProcessingRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_localization/ToggleFilterProcessingRequest";
  static final java.lang.String _DEFINITION = "bool on\n";
  boolean getOn();
  void setOn(boolean value);
}
