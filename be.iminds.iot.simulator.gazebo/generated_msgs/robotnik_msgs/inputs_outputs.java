package robotnik_msgs;

public interface inputs_outputs extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/inputs_outputs";
  static final java.lang.String _DEFINITION = "bool[] digital_inputs\nbool[] digital_outputs\nfloat32[] analog_inputs\nfloat32[] analog_outputs\n";
  boolean[] getDigitalInputs();
  void setDigitalInputs(boolean[] value);
  boolean[] getDigitalOutputs();
  void setDigitalOutputs(boolean[] value);
  float[] getAnalogInputs();
  void setAnalogInputs(float[] value);
  float[] getAnalogOutputs();
  void setAnalogOutputs(float[] value);
}
