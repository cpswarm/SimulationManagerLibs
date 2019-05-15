package robot_local_control_msgs;

public interface SetGoToPetitionResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/SetGoToPetitionResponse";
  static final java.lang.String _DEFINITION = "bool success   # indicate successful run of triggered service\nstring message # informational, e.g. for error messages";
  boolean getSuccess();
  void setSuccess(boolean value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
