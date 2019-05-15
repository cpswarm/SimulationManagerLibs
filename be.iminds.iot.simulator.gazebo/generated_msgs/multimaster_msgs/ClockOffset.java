package multimaster_msgs;

public interface ClockOffset extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs/ClockOffset";
  static final java.lang.String _DEFINITION = "duration offset\n";
  org.ros.message.Duration getOffset();
  void setOffset(org.ros.message.Duration value);
}
