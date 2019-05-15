package robotnik_msgs;

public interface set_digital_outputRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/set_digital_outputRequest";
  static final java.lang.String _DEFINITION = "int8 output\nbool value\n";
  byte getOutput();
  void setOutput(byte value);
  boolean getValue();
  void setValue(boolean value);
}
