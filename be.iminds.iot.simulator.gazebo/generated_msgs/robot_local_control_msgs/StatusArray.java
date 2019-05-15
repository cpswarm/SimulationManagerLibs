package robot_local_control_msgs;

public interface StatusArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/StatusArray";
  static final java.lang.String _DEFINITION = "Header header\nStatus[] status\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<robot_local_control_msgs.Status> getStatus();
  void setStatus(java.util.List<robot_local_control_msgs.Status> value);
}
