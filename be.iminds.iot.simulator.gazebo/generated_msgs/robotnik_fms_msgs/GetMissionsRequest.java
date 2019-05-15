package robotnik_fms_msgs;

public interface GetMissionsRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/GetMissionsRequest";
  static final java.lang.String _DEFINITION = "int32 id\nint32 robot_id\n";
  int getId();
  void setId(int value);
  int getRobotId();
  void setRobotId(int value);
}
