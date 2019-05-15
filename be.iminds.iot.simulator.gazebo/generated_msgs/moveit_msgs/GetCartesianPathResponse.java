package moveit_msgs;

public interface GetCartesianPathResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetCartesianPathResponse";
  static final java.lang.String _DEFINITION = "\n# The state at which the computed path starts\nRobotState start_state\n\n# The computed solution trajectory, for the desired group, in configuration space\nRobotTrajectory solution\n\n# If the computation was incomplete, this value indicates the fraction of the path\n# that was in fact computed (nr of waypoints traveled through)\nfloat64 fraction\n\n# The error code of the computation\nMoveItErrorCodes error_code";
  moveit_msgs.RobotState getStartState();
  void setStartState(moveit_msgs.RobotState value);
  moveit_msgs.RobotTrajectory getSolution();
  void setSolution(moveit_msgs.RobotTrajectory value);
  double getFraction();
  void setFraction(double value);
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
}
