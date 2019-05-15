package robotnik_msgs;

public interface BatteryStatusStamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/BatteryStatusStamped";
  static final java.lang.String _DEFINITION = "Header header\nBatteryStatus status\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  robotnik_msgs.BatteryStatus getStatus();
  void setStatus(robotnik_msgs.BatteryStatus value);
}
