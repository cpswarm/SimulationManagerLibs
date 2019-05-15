package robotnik_msgs;

public interface BatteryDockingStatusStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/BatteryDockingStatusStamped";
  static final java.lang.String _DEFINITION = "Header header\nBatteryDockingStatus status\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  robotnik_msgs.BatteryDockingStatus getStatus();
  void setStatus(robotnik_msgs.BatteryDockingStatus value);
}
