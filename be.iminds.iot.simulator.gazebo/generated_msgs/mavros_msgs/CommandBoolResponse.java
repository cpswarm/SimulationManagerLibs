package mavros_msgs;

public interface CommandBoolResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/CommandBoolResponse";
  static final java.lang.String _DEFINITION = "bool success\nuint8 result";
  boolean getSuccess();
  void setSuccess(boolean value);
  byte getResult();
  void setResult(byte value);
}
