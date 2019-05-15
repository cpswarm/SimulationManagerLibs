package robotnik_fms_msgs;

public interface GetRobotStatusRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/GetRobotStatusRequest";
  static final java.lang.String _DEFINITION = "int32 robot_id\n";
  int getRobotId();
  void setRobotId(int value);
}
