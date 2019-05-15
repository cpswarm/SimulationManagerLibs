package kobuki_msgs;

public interface MotorPower extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/MotorPower";
  static final java.lang.String _DEFINITION = "# Turn on/off Kobuki\'s motors\n\n# State\nuint8 OFF = 0\nuint8 ON  = 1\n\nuint8 state";
  static final byte OFF = 0;
  static final byte ON = 1;
  byte getState();
  void setState(byte value);
}
