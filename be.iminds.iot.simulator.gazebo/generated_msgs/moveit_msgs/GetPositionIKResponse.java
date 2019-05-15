package moveit_msgs;

public interface GetPositionIKResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetPositionIKResponse";
  static final java.lang.String _DEFINITION = "\n# The returned solution \n# (in the same order as the list of joints specified in the IKRequest message)\nRobotState solution\n\nMoveItErrorCodes error_code";
  moveit_msgs.RobotState getSolution();
  void setSolution(moveit_msgs.RobotState value);
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
}
