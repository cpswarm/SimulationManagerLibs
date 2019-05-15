package procedures_msgs;

public interface ProcedureQueryRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "procedures_msgs/ProcedureQueryRequest";
  static final java.lang.String _DEFINITION = "ProcedureHeader header\n";
  procedures_msgs.ProcedureHeader getHeader();
  void setHeader(procedures_msgs.ProcedureHeader value);
}
