package rocon_app_manager_msgs;

public interface StopRappResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_app_manager_msgs/StopRappResponse";
  static final java.lang.String _DEFINITION = "# true if app stopped, false otherwise\nbool stopped\n# classifying start success/failure, see ErrorCodes.msg\nint32 error_code\n# human friendly string for debugging (usually upon error)\nstring message";
  boolean getStopped();
  void setStopped(boolean value);
  int getErrorCode();
  void setErrorCode(int value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
