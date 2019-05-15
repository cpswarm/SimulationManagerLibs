package create_node;

public interface BatteryState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "create_node/BatteryState";
  static final java.lang.String _DEFINITION = "Header header\nint8 temperature\nuint16 charge\nuint16 capacity\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  byte getTemperature();
  void setTemperature(byte value);
  short getCharge();
  void setCharge(short value);
  short getCapacity();
  void setCapacity(short value);
}
