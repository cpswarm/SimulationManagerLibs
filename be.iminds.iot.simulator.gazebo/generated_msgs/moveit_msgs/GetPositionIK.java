package moveit_msgs;

public interface GetPositionIK extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetPositionIK";
  static final java.lang.String _DEFINITION = "# A service call to carry out an inverse kinematics computation\n# The inverse kinematics request\nPositionIKRequest ik_request\n\n---\n\n# The returned solution \n# (in the same order as the list of joints specified in the IKRequest message)\nRobotState solution\n\nMoveItErrorCodes error_code\n";
}
