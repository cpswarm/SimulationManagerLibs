package robotnik_msgs;

public interface MotorsStatusDifferential extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/MotorsStatusDifferential";
  static final java.lang.String _DEFINITION = "MotorStatus lwStatus\nMotorStatus rwStatus\n\n";
  robotnik_msgs.MotorStatus getLwStatus();
  void setLwStatus(robotnik_msgs.MotorStatus value);
  robotnik_msgs.MotorStatus getRwStatus();
  void setRwStatus(robotnik_msgs.MotorStatus value);
}
