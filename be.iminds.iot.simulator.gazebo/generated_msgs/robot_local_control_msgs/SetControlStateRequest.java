package robot_local_control_msgs;

public interface SetControlStateRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/SetControlStateRequest";
  static final java.lang.String _DEFINITION = "# CONTROL STATES OF THE ROBOT\n# autonomous: the robot is moving autonomously\n# manual: the robot is being tele-operated by an operator\n# follow: the robot is following a person \n\n# see robot_local_control_msgs/State for the CONTROL_STATE options/commands\nstring command\n";
  java.lang.String getCommand();
  void setCommand(java.lang.String value);
}
