package robotnik_fms_msgs;

public interface SetPhotocellRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/SetPhotocellRequest";
  static final java.lang.String _DEFINITION = "int32 id\nbool value\n\n";
  int getId();
  void setId(int value);
  boolean getValue();
  void setValue(boolean value);
}
