package robotnik_msgs;

public interface ResetFromSubStateResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/ResetFromSubStateResponse";
  static final java.lang.String _DEFINITION = "\n# substate of the component when change\nint32 currentSubState\n\n# The change is correct\nbool success\n\n# Text message - additional status information\nstring msg";
  int getCurrentSubState();
  void setCurrentSubState(int value);
  boolean getSuccess();
  void setSuccess(boolean value);
  java.lang.String getMsg();
  void setMsg(java.lang.String value);
}
