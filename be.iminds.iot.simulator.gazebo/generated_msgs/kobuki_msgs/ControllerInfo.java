package kobuki_msgs;

public interface ControllerInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/ControllerInfo";
  static final java.lang.String _DEFINITION = "# Controller info message, contains PID parameters\n\nuint8 DEFAULT   =  0\nuint8 USER_CONFIGURED =  1\n\nuint8 type\nfloat64 p_gain #should be positive\nfloat64 i_gain #should be positive\nfloat64 d_gain #should be positive\n";
  static final byte DEFAULT = 0;
  static final byte USER_CONFIGURED = 1;
  byte getType();
  void setType(byte value);
  double getPGain();
  void setPGain(double value);
  double getIGain();
  void setIGain(double value);
  double getDGain();
  void setDGain(double value);
}
