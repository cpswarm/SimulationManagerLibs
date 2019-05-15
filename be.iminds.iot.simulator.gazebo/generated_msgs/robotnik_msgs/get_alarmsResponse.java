package robotnik_msgs;

public interface get_alarmsResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/get_alarmsResponse";
  static final java.lang.String _DEFINITION = "alarmsmonitor alarms";
  robotnik_msgs.alarmsmonitor getAlarms();
  void setAlarms(robotnik_msgs.alarmsmonitor value);
}
