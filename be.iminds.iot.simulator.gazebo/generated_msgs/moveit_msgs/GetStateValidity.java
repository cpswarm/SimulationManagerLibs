package moveit_msgs;

public interface GetStateValidity extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetStateValidity";
  static final java.lang.String _DEFINITION = "RobotState robot_state\nstring group_name\nConstraints constraints\n\n---\n\nbool valid\nContactInformation[] contacts\nCostSource[] cost_sources\nConstraintEvalResult[] constraint_result\n";
}
