package robotnik_msgs;

public interface SubState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/SubState";
  static final java.lang.String _DEFINITION = "\n# substate of the component\n# each component has its own state machines on each state \nint32 substate\n\n# Description of the substate\nstring substate_description\n\n# Text message - additional status information\nstring msg\n";
  int getSubstate();
  void setSubstate(int value);
  java.lang.String getSubstateDescription();
  void setSubstateDescription(java.lang.String value);
  java.lang.String getMsg();
  void setMsg(java.lang.String value);
}
