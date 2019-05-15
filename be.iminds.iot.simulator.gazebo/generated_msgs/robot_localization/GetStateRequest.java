package robot_localization;

public interface GetStateRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_localization/GetStateRequest";
  static final java.lang.String _DEFINITION = "time time_stamp\nstring frame_id\n";
  org.ros.message.Time getTimeStamp();
  void setTimeStamp(org.ros.message.Time value);
  java.lang.String getFrameId();
  void setFrameId(java.lang.String value);
}
