package franka_control;

public interface SetCartesianImpedanceResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "franka_control/SetCartesianImpedanceResponse";
  static final java.lang.String _DEFINITION = "bool success\nstring error";
  boolean getSuccess();
  void setSuccess(boolean value);
  java.lang.String getError();
  void setError(java.lang.String value);
}
