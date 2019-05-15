package robotnik_msgs;

public interface alarmsmonitor extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/alarmsmonitor";
  static final java.lang.String _DEFINITION = "alarmmonitor[] alarms\n";
  java.util.List<robotnik_msgs.alarmmonitor> getAlarms();
  void setAlarms(java.util.List<robotnik_msgs.alarmmonitor> value);
}
