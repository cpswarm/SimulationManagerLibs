package robot_local_control_msgs;

public interface MissionParamBool extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/MissionParamBool";
  static final java.lang.String _DEFINITION = "# param name\nstring name\n# param value\nbool value\n\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  boolean getValue();
  void setValue(boolean value);
}
