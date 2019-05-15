package robotnik_fms_msgs;

public interface MissionsStatusString extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/MissionsStatusString";
  static final java.lang.String _DEFINITION = "string[] mission_status\n";
  java.util.List<java.lang.String> getMissionStatus();
  void setMissionStatus(java.util.List<java.lang.String> value);
}
