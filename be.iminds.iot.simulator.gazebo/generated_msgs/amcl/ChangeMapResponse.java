package amcl;

public interface ChangeMapResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "amcl/ChangeMapResponse";
  static final java.lang.String _DEFINITION = "bool ret # maybe this could be changed to success, as it is more ros standard\nstring message";
  boolean getRet();
  void setRet(boolean value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
