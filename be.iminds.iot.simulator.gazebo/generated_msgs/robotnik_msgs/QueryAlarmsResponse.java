package robotnik_msgs;

public interface QueryAlarmsResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/QueryAlarmsResponse";
  static final java.lang.String _DEFINITION = "QueryAlarm[] alarms\nbool success\nstring msg";
  java.util.List<robotnik_msgs.QueryAlarm> getAlarms();
  void setAlarms(java.util.List<robotnik_msgs.QueryAlarm> value);
  boolean getSuccess();
  void setSuccess(boolean value);
  java.lang.String getMsg();
  void setMsg(java.lang.String value);
}
