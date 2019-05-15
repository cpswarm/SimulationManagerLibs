package kobuki_msgs;

public interface WheelDropEvent extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/WheelDropEvent";
  static final java.lang.String _DEFINITION = "# Provides a wheel drop event.\n# This message is generated whenever one of the wheels is dropped (robot fell\n# or was raised) or raised (normal condition).\n# Note that, despite wheel_drop field on SensorState messages, state field is\n# not a bitmask, but the new state of a single sensor.\n\n# wheel\nuint8 LEFT  = 0\nuint8 RIGHT = 1\n\n# state\nuint8 RAISED  = 0\nuint8 DROPPED = 1\n\nuint8 wheel\nuint8 state\n";
  static final byte LEFT = 0;
  static final byte RIGHT = 1;
  static final byte RAISED = 0;
  static final byte DROPPED = 1;
  byte getWheel();
  void setWheel(byte value);
  byte getState();
  void setState(byte value);
}
