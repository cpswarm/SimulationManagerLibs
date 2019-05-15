package robotnik_fms_msgs;

public interface CurrentMissions extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/CurrentMissions";
  static final java.lang.String _DEFINITION = "robotnik_fms_msgs/Mission[] missions\n";
  java.util.List<robotnik_fms_msgs.Mission> getMissions();
  void setMissions(java.util.List<robotnik_fms_msgs.Mission> value);
}
