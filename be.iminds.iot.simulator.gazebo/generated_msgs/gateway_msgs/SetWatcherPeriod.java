package gateway_msgs;

public interface SetWatcherPeriod extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/SetWatcherPeriod";
  static final java.lang.String _DEFINITION = "# set the watcher loop period (float value in secs).\n# a negative value or 0.0 returns it to the default set by param\nfloat32 period\n---\n# return the previous setting used for this variable\nfloat32 last_period";
}
