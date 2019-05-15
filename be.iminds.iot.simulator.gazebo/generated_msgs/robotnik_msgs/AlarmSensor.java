package robotnik_msgs;

public interface AlarmSensor extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/AlarmSensor";
  static final java.lang.String _DEFINITION = "int8 id\nstring description\nstring message\n\n";
  byte getId();
  void setId(byte value);
  java.lang.String getDescription();
  void setDescription(java.lang.String value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
