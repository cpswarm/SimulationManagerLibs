package multimaster_msgs;

public interface GetClockOffsetResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs/GetClockOffsetResponse";
  static final java.lang.String _DEFINITION = "multimaster_msgs/ClockOffset clock_offset";
  multimaster_msgs.ClockOffset getClockOffset();
  void setClockOffset(multimaster_msgs.ClockOffset value);
}
