package robotnik_msgs;

public interface named_input_output extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/named_input_output";
  static final java.lang.String _DEFINITION = "string name\nbool value";
  java.lang.String getName();
  void setName(java.lang.String value);
  boolean getValue();
  void setValue(boolean value);
}
