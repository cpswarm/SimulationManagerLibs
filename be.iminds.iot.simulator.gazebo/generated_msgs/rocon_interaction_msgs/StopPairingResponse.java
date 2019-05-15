package rocon_interaction_msgs;

public interface StopPairingResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/StopPairingResponse";
  static final java.lang.String _DEFINITION = "int32 result\nstring message";
  int getResult();
  void setResult(int value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
