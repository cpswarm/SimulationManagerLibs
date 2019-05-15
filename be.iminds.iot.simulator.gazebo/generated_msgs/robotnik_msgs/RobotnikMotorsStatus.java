package robotnik_msgs;

public interface RobotnikMotorsStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/RobotnikMotorsStatus";
  static final java.lang.String _DEFINITION = "# Name of each motor drive\nstring[] name\n# CAN ID of each motor drive\nint32[] can_id\n# Status of the motor drive\nrobotnik_msgs/MotorStatus[] motor_status\n\n";
  java.util.List<java.lang.String> getName();
  void setName(java.util.List<java.lang.String> value);
  int[] getCanId();
  void setCanId(int[] value);
  java.util.List<robotnik_msgs.MotorStatus> getMotorStatus();
  void setMotorStatus(java.util.List<robotnik_msgs.MotorStatus> value);
}
