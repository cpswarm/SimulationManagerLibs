package robotnik_msgs;

public interface named_inputs_outputs extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/named_inputs_outputs";
  static final java.lang.String _DEFINITION = "robotnik_msgs/named_input_output[] digital_inputs\nrobotnik_msgs/named_input_output[] digital_outputs";
  java.util.List<robotnik_msgs.named_input_output> getDigitalInputs();
  void setDigitalInputs(java.util.List<robotnik_msgs.named_input_output> value);
  java.util.List<robotnik_msgs.named_input_output> getDigitalOutputs();
  void setDigitalOutputs(java.util.List<robotnik_msgs.named_input_output> value);
}
