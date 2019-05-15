package moveit_msgs;

public interface MotionPlanResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/MotionPlanResponse";
  static final java.lang.String _DEFINITION = "# The representation of a solution to a planning problem\n\n# The corresponding robot state\nRobotState trajectory_start\n\n# The group used for planning (usually the same as in the request)\nstring group_name\n\n# A solution trajectory, if found\nRobotTrajectory trajectory\n\n# Planning time (seconds)\nfloat64 planning_time\n\n# Error code - encodes the overall reason for failure\nMoveItErrorCodes error_code\n";
  moveit_msgs.RobotState getTrajectoryStart();
  void setTrajectoryStart(moveit_msgs.RobotState value);
  java.lang.String getGroupName();
  void setGroupName(java.lang.String value);
  moveit_msgs.RobotTrajectory getTrajectory();
  void setTrajectory(moveit_msgs.RobotTrajectory value);
  double getPlanningTime();
  void setPlanningTime(double value);
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
}
