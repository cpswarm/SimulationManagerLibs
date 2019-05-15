package robot_local_control_msgs;

public interface SensorStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/SensorStatus";
  static final java.lang.String _DEFINITION = "# Human readable name\nstring name\n\n# Type of sensor\nstring type\n\n# INIT, READY, EMERGENCY, FAILURE\nstring state\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getType();
  void setType(java.lang.String value);
  java.lang.String getState();
  void setState(java.lang.String value);
}
