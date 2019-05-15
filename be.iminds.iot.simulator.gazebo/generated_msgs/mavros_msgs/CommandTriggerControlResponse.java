package mavros_msgs;

public interface CommandTriggerControlResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/CommandTriggerControlResponse";
  static final java.lang.String _DEFINITION = "bool success\nuint8 result";
  boolean getSuccess();
  void setSuccess(boolean value);
  byte getResult();
  void setResult(byte value);
}
