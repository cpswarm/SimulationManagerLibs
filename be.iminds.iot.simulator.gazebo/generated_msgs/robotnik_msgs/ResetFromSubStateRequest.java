package robotnik_msgs;

public interface ResetFromSubStateRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/ResetFromSubStateRequest";
  static final java.lang.String _DEFINITION = "#new substate\nint32 subState\n\n";
  int getSubState();
  void setSubState(int value);
}
