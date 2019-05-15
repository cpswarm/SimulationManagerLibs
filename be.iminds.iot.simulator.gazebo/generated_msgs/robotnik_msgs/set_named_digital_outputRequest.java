package robotnik_msgs;

public interface set_named_digital_outputRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/set_named_digital_outputRequest";
  static final java.lang.String _DEFINITION = "string name\nbool value\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  boolean getValue();
  void setValue(boolean value);
}
