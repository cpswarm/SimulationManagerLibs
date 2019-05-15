package robotnik_msgs;

public interface Alarms extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/Alarms";
  static final java.lang.String _DEFINITION = "AlarmSensor[] alarms\n";
  java.util.List<robotnik_msgs.AlarmSensor> getAlarms();
  void setAlarms(java.util.List<robotnik_msgs.AlarmSensor> value);
}
