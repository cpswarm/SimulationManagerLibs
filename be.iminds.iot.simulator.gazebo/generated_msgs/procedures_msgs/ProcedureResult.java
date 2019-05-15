package procedures_msgs;

public interface ProcedureResult extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "procedures_msgs/ProcedureResult";
  static final java.lang.String _DEFINITION = "# RESULT allowed values. Defined as STRING because it is easier to identify them in a raw message\nstring OK=ok\nstring ERROR=error\n\nstring result\nstring message\n";
  static final java.lang.String OK = "ok";
  static final java.lang.String ERROR = "error";
  java.lang.String getResult();
  void setResult(java.lang.String value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
