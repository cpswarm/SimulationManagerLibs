package robotnik_fms_msgs;

public interface ControlElevatorRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/ControlElevatorRequest";
  static final java.lang.String _DEFINITION = "# Control true: get control false: leave control\nbool control\n\n# elevator: id of Elevator to control\nint32 elevator\n\n# agent: id of agent to control elevator once this agent has control  \n#   other agent cannot control this elevator until an order of leave control \nint32 agent\n\n# floor >= 0 send to floor\nint32 floor\n\n# dooropen true: open door\nbool dooropen\n\n# doorclose true: close door\nbool doorclose\n\n";
  boolean getControl();
  void setControl(boolean value);
  int getElevator();
  void setElevator(int value);
  int getAgent();
  void setAgent(int value);
  int getFloor();
  void setFloor(int value);
  boolean getDooropen();
  void setDooropen(boolean value);
  boolean getDoorclose();
  void setDoorclose(boolean value);
}
