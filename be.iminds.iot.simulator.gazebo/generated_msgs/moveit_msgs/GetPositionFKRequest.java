package moveit_msgs;

public interface GetPositionFKRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetPositionFKRequest";
  static final java.lang.String _DEFINITION = "# A service definition for a standard forward kinematics service\n# The frame_id in the header message is the frame in which \n# the forward kinematics poses will be returned\nHeader header\n\n# A vector of link name for which forward kinematics must be computed\nstring[] fk_link_names\n\n# A robot state consisting of joint names and joint positions to be used for forward kinematics\nRobotState robot_state\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<java.lang.String> getFkLinkNames();
  void setFkLinkNames(java.util.List<java.lang.String> value);
  moveit_msgs.RobotState getRobotState();
  void setRobotState(moveit_msgs.RobotState value);
}
