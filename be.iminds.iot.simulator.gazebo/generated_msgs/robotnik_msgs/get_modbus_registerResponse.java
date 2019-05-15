package robotnik_msgs;

public interface get_modbus_registerResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/get_modbus_registerResponse";
  static final java.lang.String _DEFINITION = "bool ret \nuint16 value";
  boolean getRet();
  void setRet(boolean value);
  short getValue();
  void setValue(short value);
}
