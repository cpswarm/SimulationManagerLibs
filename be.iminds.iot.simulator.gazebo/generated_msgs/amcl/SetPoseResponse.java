package amcl;

public interface SetPoseResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "amcl/SetPoseResponse";
  static final java.lang.String _DEFINITION = "bool success\nstring message";
  boolean getSuccess();
  void setSuccess(boolean value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
