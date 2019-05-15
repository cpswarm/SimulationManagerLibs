package turtlebot_msgs;

public interface SetFollowStateRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "turtlebot_msgs/SetFollowStateRequest";
  static final java.lang.String _DEFINITION = "uint8 STOPPED = 0\nuint8 FOLLOW  = 1\n\n# Following running/stopped\nuint8 state\n\n";
  static final byte STOPPED = 0;
  static final byte FOLLOW = 1;
  byte getState();
  void setState(byte value);
}
