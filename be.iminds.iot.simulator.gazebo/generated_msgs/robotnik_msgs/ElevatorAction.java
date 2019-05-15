package robotnik_msgs;

public interface ElevatorAction extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/ElevatorAction";
  static final java.lang.String _DEFINITION = "int32 RAISE=1\nint32 LOWER=-1\nint32 STOP=0\nint32 NO_ACTION=1000\n\nint32 action\n# speed, height for future applications\n";
  static final int RAISE = 1;
  static final int LOWER = -1;
  static final int STOP = 0;
  static final int NO_ACTION = 1000;
  int getAction();
  void setAction(int value);
}
