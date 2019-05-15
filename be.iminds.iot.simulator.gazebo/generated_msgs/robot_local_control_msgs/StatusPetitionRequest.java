package robot_local_control_msgs;

public interface StatusPetitionRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/StatusPetitionRequest";
  static final java.lang.String _DEFINITION = "Status procedure\n";
  robot_local_control_msgs.Status getProcedure();
  void setProcedure(robot_local_control_msgs.Status value);
}
