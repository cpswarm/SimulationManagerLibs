package robot_localization;

public interface ToggleFilterProcessingResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_localization/ToggleFilterProcessingResponse";
  static final java.lang.String _DEFINITION = "bool status";
  boolean getStatus();
  void setStatus(boolean value);
}
