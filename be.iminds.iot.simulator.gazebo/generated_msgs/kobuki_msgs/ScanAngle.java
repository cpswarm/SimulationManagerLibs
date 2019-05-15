package kobuki_msgs;

public interface ScanAngle extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/ScanAngle";
  static final java.lang.String _DEFINITION = "Header header\nfloat64 scan_angle";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double getScanAngle();
  void setScanAngle(double value);
}
