package robotnik_msgs;

public interface get_modbus_registerRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/get_modbus_registerRequest";
  static final java.lang.String _DEFINITION = "int32 address\n";
  int getAddress();
  void setAddress(int value);
}
