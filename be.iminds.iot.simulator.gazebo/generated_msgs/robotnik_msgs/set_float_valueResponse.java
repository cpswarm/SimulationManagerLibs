package robotnik_msgs;

public interface set_float_valueResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/set_float_valueResponse";
  static final java.lang.String _DEFINITION = "bool ret\nstd_msgs/String errorMessage";
  boolean getRet();
  void setRet(boolean value);
  std_msgs.String getErrorMessage();
  void setErrorMessage(std_msgs.String value);
}
