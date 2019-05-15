package kobuki_msgs;

public interface RobotStateEvent extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/RobotStateEvent";
  static final java.lang.String _DEFINITION = "# Provides a robot state event\n# This message is generated whenever the robot gets online/offline\n\nuint8 ONLINE  = 1\nuint8 OFFLINE = 0\n\nuint8 state\n";
  static final byte ONLINE = 1;
  static final byte OFFLINE = 0;
  byte getState();
  void setState(byte value);
}
