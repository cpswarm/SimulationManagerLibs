package robotnik_msgs;

public interface set_analog_outputRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/set_analog_outputRequest";
  static final java.lang.String _DEFINITION = "int8 output\nfloat32 value\n";
  byte getOutput();
  void setOutput(byte value);
  float getValue();
  void setValue(float value);
}
