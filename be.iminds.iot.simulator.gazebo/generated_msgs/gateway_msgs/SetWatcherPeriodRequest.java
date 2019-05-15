package gateway_msgs;

public interface SetWatcherPeriodRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/SetWatcherPeriodRequest";
  static final java.lang.String _DEFINITION = "# set the watcher loop period (float value in secs).\n# a negative value or 0.0 returns it to the default set by param\nfloat32 period\n";
  float getPeriod();
  void setPeriod(float value);
}
