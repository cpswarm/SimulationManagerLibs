package turtlebot_msgs;

public interface SetFollowStateResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "turtlebot_msgs/SetFollowStateResponse";
  static final java.lang.String _DEFINITION = "\nuint8 OK    = 0\nuint8 ERROR = 1\n\nuint8 result";
  static final byte OK = 0;
  static final byte ERROR = 1;
  byte getResult();
  void setResult(byte value);
}
