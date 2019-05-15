package rocon_interaction_msgs;

public interface StartPairingResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/StartPairingResponse";
  static final java.lang.String _DEFINITION = "int32 result\nstring message";
  int getResult();
  void setResult(int value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
