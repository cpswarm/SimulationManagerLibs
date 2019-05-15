package rocon_app_manager_msgs;

public interface StartRappResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_app_manager_msgs/StartRappResponse";
  static final java.lang.String _DEFINITION = "bool started\n\n# classifying start success/failure, see ErrorCodes.msg\nint32 error_code\n\n# human friendly string for debugging (usually upon error)\nstring message\n\n# Namespace where the rapp interface can be found\nstring application_namespace";
  boolean getStarted();
  void setStarted(boolean value);
  int getErrorCode();
  void setErrorCode(int value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
  java.lang.String getApplicationNamespace();
  void setApplicationNamespace(java.lang.String value);
}
