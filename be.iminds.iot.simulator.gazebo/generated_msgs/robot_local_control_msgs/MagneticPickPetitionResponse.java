package robot_local_control_msgs;

public interface MagneticPickPetitionResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/MagneticPickPetitionResponse";
  static final java.lang.String _DEFINITION = "procedures_msgs/ProcedureState state\nprocedures_msgs/ProcedureResult result";
  procedures_msgs.ProcedureState getState();
  void setState(procedures_msgs.ProcedureState value);
  procedures_msgs.ProcedureResult getResult();
  void setResult(procedures_msgs.ProcedureResult value);
}
