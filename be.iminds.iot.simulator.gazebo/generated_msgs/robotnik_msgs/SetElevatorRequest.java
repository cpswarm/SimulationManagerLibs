package robotnik_msgs;

public interface SetElevatorRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/SetElevatorRequest";
  static final java.lang.String _DEFINITION = "robotnik_msgs/ElevatorAction action\n";
  robotnik_msgs.ElevatorAction getAction();
  void setAction(robotnik_msgs.ElevatorAction value);
}
