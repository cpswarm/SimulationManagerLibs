package rocon_interaction_msgs;

public interface RequestInteractionResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/RequestInteractionResponse";
  static final java.lang.String _DEFINITION = "\n# classifying start success/failure, see ErrorCodes.msg\nint8 result\n\n# human friendly string for debugging (usually upon error)\nstring message";
  byte getResult();
  void setResult(byte value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
