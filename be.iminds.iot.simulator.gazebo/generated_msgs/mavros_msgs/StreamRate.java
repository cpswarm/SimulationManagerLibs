package mavros_msgs;

public interface StreamRate extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/StreamRate";
  static final java.lang.String _DEFINITION = "# sets stream rate\n# See REQUEST_DATA_STREAM message\n\nuint8 STREAM_ALL = 0\nuint8 STREAM_RAW_SENSORS = 1\nuint8 STREAM_EXTENDED_STATUS = 2\nuint8 STREAM_RC_CHANNELS = 3\nuint8 STREAM_RAW_CONTROLLER = 4\nuint8 STREAM_POSITION = 6\nuint8 STREAM_EXTRA1 = 10\nuint8 STREAM_EXTRA2 = 11\nuint8 STREAM_EXTRA3 = 12\n\nuint8 stream_id\nuint16 message_rate\nbool on_off\n---\n";
}
