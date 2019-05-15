package robotnik_fms_msgs;

public interface InsertMissionResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/InsertMissionResponse";
  static final java.lang.String _DEFINITION = "int32 id\nbool ret\nstring msg";
  int getId();
  void setId(int value);
  boolean getRet();
  void setRet(boolean value);
  java.lang.String getMsg();
  void setMsg(java.lang.String value);
}
