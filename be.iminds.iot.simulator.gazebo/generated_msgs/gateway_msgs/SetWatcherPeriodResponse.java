package gateway_msgs;

public interface SetWatcherPeriodResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/SetWatcherPeriodResponse";
  static final java.lang.String _DEFINITION = "# return the previous setting used for this variable\nfloat32 last_period";
  float getLastPeriod();
  void setLastPeriod(float value);
}
