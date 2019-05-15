package robot_local_control_msgs;

public interface MissionParamInt extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/MissionParamInt";
  static final java.lang.String _DEFINITION = "# param name\nstring name\n# param value\nint32 value\n\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  int getValue();
  void setValue(int value);
}
