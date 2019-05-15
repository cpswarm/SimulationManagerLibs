package robotnik_msgs;

public interface MotorsStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/MotorsStatus";
  static final java.lang.String _DEFINITION = "MotorStatus flwStatus\nMotorStatus blwStatus\nMotorStatus frwStatus\nMotorStatus brwStatus\n\n";
  robotnik_msgs.MotorStatus getFlwStatus();
  void setFlwStatus(robotnik_msgs.MotorStatus value);
  robotnik_msgs.MotorStatus getBlwStatus();
  void setBlwStatus(robotnik_msgs.MotorStatus value);
  robotnik_msgs.MotorStatus getFrwStatus();
  void setFrwStatus(robotnik_msgs.MotorStatus value);
  robotnik_msgs.MotorStatus getBrwStatus();
  void setBrwStatus(robotnik_msgs.MotorStatus value);
}
