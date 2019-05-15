package control_msgs;

public interface FollowJointTrajectoryResult extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "control_msgs/FollowJointTrajectoryResult";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\nint32 error_code\nint32 SUCCESSFUL = 0\nint32 INVALID_GOAL = -1\nint32 INVALID_JOINTS = -2\nint32 OLD_HEADER_TIMESTAMP = -3\nint32 PATH_TOLERANCE_VIOLATED = -4\nint32 GOAL_TOLERANCE_VIOLATED = -5\n\n# Human readable description of the error code. Contains complementary\n# information that is especially useful when execution fails, for instance:\n# - INVALID_GOAL: The reason for the invalid goal (e.g., the requested\n#   trajectory is in the past).\n# - INVALID_JOINTS: The mismatch between the expected controller joints\n#   and those provided in the goal.\n# - PATH_TOLERANCE_VIOLATED and GOAL_TOLERANCE_VIOLATED: Which joint\n#   violated which tolerance, and by how much.\nstring error_string\n\n";
  static final int SUCCESSFUL = 0;
  static final int INVALID_GOAL = -1;
  static final int INVALID_JOINTS = -2;
  static final int OLD_HEADER_TIMESTAMP = -3;
  static final int PATH_TOLERANCE_VIOLATED = -4;
  static final int GOAL_TOLERANCE_VIOLATED = -5;
  int getErrorCode();
  void setErrorCode(int value);
  java.lang.String getErrorString();
  void setErrorString(java.lang.String value);
}
