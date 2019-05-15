package kobuki_msgs;

public interface CliffEvent extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/CliffEvent";
  static final java.lang.String _DEFINITION = "# Provides a cliff sensor event.\n# This message is generated whenever a particular cliff sensor signals that the\n# robot approaches or moves away from a cliff.\n# Note that, despite cliff field on SensorState messages, state field is not a\n# bitmask, but the new state of a single sensor.\n\n# cliff sensor\nuint8 LEFT   = 0\nuint8 CENTER = 1\nuint8 RIGHT  = 2\n\n# cliff sensor state\nuint8 FLOOR = 0\nuint8 CLIFF = 1\n\nuint8 sensor\nuint8 state\n\n# distance to floor when cliff was detected\nuint16 bottom";
  static final byte LEFT = 0;
  static final byte CENTER = 1;
  static final byte RIGHT = 2;
  static final byte FLOOR = 0;
  static final byte CLIFF = 1;
  byte getSensor();
  void setSensor(byte value);
  byte getState();
  void setState(byte value);
  short getBottom();
  void setBottom(short value);
}
