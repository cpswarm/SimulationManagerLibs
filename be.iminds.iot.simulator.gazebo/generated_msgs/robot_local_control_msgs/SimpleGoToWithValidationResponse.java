package robot_local_control_msgs;

public interface SimpleGoToWithValidationResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/SimpleGoToWithValidationResponse";
  static final java.lang.String _DEFINITION = "bool success\nstring message";
  boolean getSuccess();
  void setSuccess(boolean value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
