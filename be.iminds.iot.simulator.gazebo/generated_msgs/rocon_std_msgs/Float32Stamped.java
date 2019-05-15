package rocon_std_msgs;

public interface Float32Stamped extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_std_msgs/Float32Stamped";
  static final java.lang.String _DEFINITION = "Header header\nfloat32 data\n\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getData();
  void setData(float value);
}
