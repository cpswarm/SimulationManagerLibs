package robot_local_control_msgs;

public interface MissionCommand extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/MissionCommand";
  static final java.lang.String _DEFINITION = "# available commands\nstring GOTO_POSE=goto_pose\nstring GOTO_TAG=goto_tag\nstring GOTO_NODE=goto_node\n\n# id set from the subsystem calling the service\nstring id\n# command from the available commands\nstring command\n\nMissionParamInt[] int_params\nMissionParamFloat[] float_params\nMissionParamString[] string_params\nMissionParamBool[] bool_params\n\n\n\n";
  static final java.lang.String GOTO_POSE = "goto_pose";
  static final java.lang.String GOTO_TAG = "goto_tag";
  static final java.lang.String GOTO_NODE = "goto_node";
  java.lang.String getId();
  void setId(java.lang.String value);
  java.lang.String getCommand();
  void setCommand(java.lang.String value);
  java.util.List<robot_local_control_msgs.MissionParamInt> getIntParams();
  void setIntParams(java.util.List<robot_local_control_msgs.MissionParamInt> value);
  java.util.List<robot_local_control_msgs.MissionParamFloat> getFloatParams();
  void setFloatParams(java.util.List<robot_local_control_msgs.MissionParamFloat> value);
  java.util.List<robot_local_control_msgs.MissionParamString> getStringParams();
  void setStringParams(java.util.List<robot_local_control_msgs.MissionParamString> value);
  java.util.List<robot_local_control_msgs.MissionParamBool> getBoolParams();
  void setBoolParams(java.util.List<robot_local_control_msgs.MissionParamBool> value);
}
