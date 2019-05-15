package mavros_msgs;

public interface HilControls extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/HilControls";
  static final java.lang.String _DEFINITION = "# HilControls.msg\n#\n# ROS representation of MAVLink HIL_CONTROLS\n# (deprecated, use HIL_ACTUATOR_CONTROLS instead)\n# See mavlink message documentation here:\n# https://pixhawk.ethz.ch/mavlink/#HIL_CONTROLS\n\nstd_msgs/Header header\nfloat32 roll_ailerons\nfloat32 pitch_elevator\nfloat32 yaw_rudder\nfloat32 throttle\nfloat32 aux1\nfloat32 aux2\nfloat32 aux3\nfloat32 aux4\nuint8 mode\nuint8 nav_mode\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getRollAilerons();
  void setRollAilerons(float value);
  float getPitchElevator();
  void setPitchElevator(float value);
  float getYawRudder();
  void setYawRudder(float value);
  float getThrottle();
  void setThrottle(float value);
  float getAux1();
  void setAux1(float value);
  float getAux2();
  void setAux2(float value);
  float getAux3();
  void setAux3(float value);
  float getAux4();
  void setAux4(float value);
  byte getMode();
  void setMode(byte value);
  byte getNavMode();
  void setNavMode(byte value);
}
