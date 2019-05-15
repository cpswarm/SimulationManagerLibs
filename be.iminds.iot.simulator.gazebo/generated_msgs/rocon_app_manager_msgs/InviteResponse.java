package rocon_app_manager_msgs;

public interface InviteResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_app_manager_msgs/InviteResponse";
  static final java.lang.String _DEFINITION = "bool result\n# classifying start success/failure, see ErrorCodes.msg (to be implemented)\nint32 error_code\n# human friendly string for debugging (usually upon error)\nstring message";
  boolean getResult();
  void setResult(boolean value);
  int getErrorCode();
  void setErrorCode(int value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
