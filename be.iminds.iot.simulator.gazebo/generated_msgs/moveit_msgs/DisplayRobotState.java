package moveit_msgs;

public interface DisplayRobotState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/DisplayRobotState";
  static final java.lang.String _DEFINITION = "# The robot state to display\nRobotState state\n\n# Optionally, various links can be highlighted\nObjectColor[] highlight_links\n";
  moveit_msgs.RobotState getState();
  void setState(moveit_msgs.RobotState value);
  java.util.List<moveit_msgs.ObjectColor> getHighlightLinks();
  void setHighlightLinks(java.util.List<moveit_msgs.ObjectColor> value);
}
