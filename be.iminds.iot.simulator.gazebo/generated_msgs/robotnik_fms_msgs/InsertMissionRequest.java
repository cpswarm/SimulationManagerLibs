package robotnik_fms_msgs;

public interface InsertMissionRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/InsertMissionRequest";
  static final java.lang.String _DEFINITION = "robotnik_fms_msgs/Mission mission\n";
  robotnik_fms_msgs.Mission getMission();
  void setMission(robotnik_fms_msgs.Mission value);
}
