package mavros_msgs;

public interface HilActuatorControls extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/HilActuatorControls";
  static final java.lang.String _DEFINITION = "# HilActuatorControls.msg\n#\n# ROS representation of MAVLink HIL_ACTUATOR_CONTROLS\n# See mavlink message documentation here:\n# https://pixhawk.ethz.ch/mavlink/#HIL_ACTUATOR_CONTROLS\n\nstd_msgs/Header header\nfloat32[16] controls\nuint8 mode\nuint64 flags\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float[] getControls();
  void setControls(float[] value);
  byte getMode();
  void setMode(byte value);
  long getFlags();
  void setFlags(long value);
}
