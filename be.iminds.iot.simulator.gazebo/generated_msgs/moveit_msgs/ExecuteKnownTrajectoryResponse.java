package moveit_msgs;

public interface ExecuteKnownTrajectoryResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/ExecuteKnownTrajectoryResponse";
  static final java.lang.String _DEFINITION = "\n# Error code - encodes the overall reason for failure\nMoveItErrorCodes error_code";
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
}
