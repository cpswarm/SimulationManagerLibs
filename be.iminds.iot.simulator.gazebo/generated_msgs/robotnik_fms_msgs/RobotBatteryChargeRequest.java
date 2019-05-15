package robotnik_fms_msgs;

public interface RobotBatteryChargeRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/RobotBatteryChargeRequest";
  static final java.lang.String _DEFINITION = "# Robot id to command\nint32 robot_id\nint32 charging_node\n";
  int getRobotId();
  void setRobotId(int value);
  int getChargingNode();
  void setChargingNode(int value);
}
