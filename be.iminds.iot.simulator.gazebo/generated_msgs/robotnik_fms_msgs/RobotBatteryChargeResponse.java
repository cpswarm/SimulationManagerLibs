package robotnik_fms_msgs;

public interface RobotBatteryChargeResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/RobotBatteryChargeResponse";
  static final java.lang.String _DEFINITION = "bool success\nstring message\nint32 id";
  boolean getSuccess();
  void setSuccess(boolean value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
  int getId();
  void setId(int value);
}
