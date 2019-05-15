package create_node;

public interface SetDigitalOutputsRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "create_node/SetDigitalOutputsRequest";
  static final java.lang.String _DEFINITION = "uint8 digital_out_0\nuint8 digital_out_1\nuint8 digital_out_2\n";
  byte getDigitalOut0();
  void setDigitalOut0(byte value);
  byte getDigitalOut1();
  void setDigitalOut1(byte value);
  byte getDigitalOut2();
  void setDigitalOut2(byte value);
}
