package procedures_msgs;

public interface ProcedureQueryResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "procedures_msgs/ProcedureQueryResponse";
  static final java.lang.String _DEFINITION = "ProcedureState state\nProcedureResult result\nstd_msgs/String last_message";
  procedures_msgs.ProcedureState getState();
  void setState(procedures_msgs.ProcedureState value);
  procedures_msgs.ProcedureResult getResult();
  void setResult(procedures_msgs.ProcedureResult value);
  std_msgs.String getLastMessage();
  void setLastMessage(std_msgs.String value);
}
