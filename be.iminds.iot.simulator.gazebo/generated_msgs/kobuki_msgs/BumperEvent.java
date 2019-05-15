package kobuki_msgs;

public interface BumperEvent extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/BumperEvent";
  static final java.lang.String _DEFINITION = "# Provides a bumper event.\n# This message is generated whenever a particular bumper is pressed or released.\n# Note that, despite bumper field on SensorState messages, state field is not a\n# bitmask, but the new state of a single sensor.\n\n# bumper\nuint8 LEFT   = 0\nuint8 CENTER = 1\nuint8 RIGHT  = 2\n\n# state\nuint8 RELEASED = 0\nuint8 PRESSED  = 1\n\nuint8 bumper\nuint8 state\n";
  static final byte LEFT = 0;
  static final byte CENTER = 1;
  static final byte RIGHT = 2;
  static final byte RELEASED = 0;
  static final byte PRESSED = 1;
  byte getBumper();
  void setBumper(byte value);
  byte getState();
  void setState(byte value);
}
