package robotnik_msgs;

public interface SetNamedDigitalOutputRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/SetNamedDigitalOutputRequest";
  static final java.lang.String _DEFINITION = "string name\nbool value\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  boolean getValue();
  void setValue(boolean value);
}
