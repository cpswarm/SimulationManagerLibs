package mavros_msgs;

public interface Thrust extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/Thrust";
  static final java.lang.String _DEFINITION = "# Thrust to send to the FCU\n\nstd_msgs/Header header\n\nfloat32 thrust\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getThrust();
  void setThrust(float value);
}
