package marker_mapping;

public interface SetFrameIdResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "marker_mapping/SetFrameIdResponse";
  static final java.lang.String _DEFINITION = "bool ret\nstring message";
  boolean getRet();
  void setRet(boolean value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
