package stdr_msgs;

public interface AddRfidTagResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/AddRfidTagResponse";
  static final java.lang.String _DEFINITION = "bool success\nstring message";
  boolean getSuccess();
  void setSuccess(boolean value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
