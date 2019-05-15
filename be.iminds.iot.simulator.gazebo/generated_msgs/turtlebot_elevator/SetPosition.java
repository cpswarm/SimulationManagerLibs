package turtlebot_elevator;

public interface SetPosition extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "turtlebot_elevator/SetPosition";
  static final java.lang.String _DEFINITION = "int32 RAISE=1 \nint32 LOWER=-1\n\nint32 value\n";
  static final int RAISE = 1;
  static final int LOWER = -1;
  int getValue();
  void setValue(int value);
}
