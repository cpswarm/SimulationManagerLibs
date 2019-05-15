package robotnik_msgs;

public interface set_modbus_registerRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/set_modbus_registerRequest";
  static final java.lang.String _DEFINITION = "int32 address\nuint16 value\n";
  int getAddress();
  void setAddress(int value);
  short getValue();
  void setValue(short value);
}
