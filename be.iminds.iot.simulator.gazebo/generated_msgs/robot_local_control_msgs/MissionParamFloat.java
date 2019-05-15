package robot_local_control_msgs;

public interface MissionParamFloat extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/MissionParamFloat";
  static final java.lang.String _DEFINITION = "# param name\nstring name\n# param value\nfloat32 value\n\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  float getValue();
  void setValue(float value);
}
