package robotnik_msgs;

public interface alarmmonitor extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/alarmmonitor";
  static final java.lang.String _DEFINITION = "# type: error, warning, event\nstring type\n# displaing number for monitoring\nint32 display\n# component\nstring component\n# To be shown in HMI\nbool hmi\n# group: alarm group all alarms of same group will be reset at same time\nstring group\n# text: more explained information about alarm, should include group, time, conditions, etc\nstring text\n# seconds active\nuint64 seconds_active\n";
  java.lang.String getType();
  void setType(java.lang.String value);
  int getDisplay();
  void setDisplay(int value);
  java.lang.String getComponent();
  void setComponent(java.lang.String value);
  boolean getHmi();
  void setHmi(boolean value);
  java.lang.String getGroup();
  void setGroup(java.lang.String value);
  java.lang.String getText();
  void setText(java.lang.String value);
  long getSecondsActive();
  void setSecondsActive(long value);
}
