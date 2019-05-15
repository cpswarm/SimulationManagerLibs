package robotnik_fms_msgs;

public interface GetMissionsResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/GetMissionsResponse";
  static final java.lang.String _DEFINITION = "robotnik_fms_msgs/Mission[] missions\nbool ret\nstring msg";
  java.util.List<robotnik_fms_msgs.Mission> getMissions();
  void setMissions(java.util.List<robotnik_fms_msgs.Mission> value);
  boolean getRet();
  void setRet(boolean value);
  java.lang.String getMsg();
  void setMsg(java.lang.String value);
}
