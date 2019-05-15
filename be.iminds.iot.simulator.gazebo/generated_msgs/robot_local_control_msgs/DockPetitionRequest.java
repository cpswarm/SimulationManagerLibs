package robot_local_control_msgs;

public interface DockPetitionRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/DockPetitionRequest";
  static final java.lang.String _DEFINITION = "Dock procedure \n";
  robot_local_control_msgs.Dock getProcedure();
  void setProcedure(robot_local_control_msgs.Dock value);
}
