package kobuki_msgs;

public interface ButtonEvent extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/ButtonEvent";
  static final java.lang.String _DEFINITION = "# Provides a button event.\n# This message is generated whenever a particular button is pressed or released.\n# Note that, despite buttons field on SensorState messages, state field is not a\n# bitmask, but the new state of a single button.\n\nuint8 Button0 = 0\nuint8 Button1 = 1\nuint8 Button2 = 2\n\nuint8 RELEASED = 0\nuint8 PRESSED  = 1\n\nuint8 button\nuint8 state\n";
  static final byte Button0 = 0;
  static final byte Button1 = 1;
  static final byte Button2 = 2;
  static final byte RELEASED = 0;
  static final byte PRESSED = 1;
  byte getButton();
  void setButton(byte value);
  byte getState();
  void setState(byte value);
}
