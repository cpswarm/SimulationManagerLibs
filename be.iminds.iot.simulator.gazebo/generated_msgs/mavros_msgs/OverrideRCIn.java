package mavros_msgs;

public interface OverrideRCIn extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/OverrideRCIn";
  static final java.lang.String _DEFINITION = "# Override RC Input\n# Currently MAVLink defines override for 8 channel\n\nuint16 CHAN_RELEASE=0\nuint16 CHAN_NOCHANGE=65535\n\nuint16[8] channels\n";
  static final short CHAN_RELEASE = 0;
  static final short CHAN_NOCHANGE = -1;
  short[] getChannels();
  void setChannels(short[] value);
}
