package stdr_msgs;

public interface DeleteRobotAction extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/DeleteRobotAction";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nDeleteRobotActionGoal action_goal\nDeleteRobotActionResult action_result\nDeleteRobotActionFeedback action_feedback\n";
  stdr_msgs.DeleteRobotActionGoal getActionGoal();
  void setActionGoal(stdr_msgs.DeleteRobotActionGoal value);
  stdr_msgs.DeleteRobotActionResult getActionResult();
  void setActionResult(stdr_msgs.DeleteRobotActionResult value);
  stdr_msgs.DeleteRobotActionFeedback getActionFeedback();
  void setActionFeedback(stdr_msgs.DeleteRobotActionFeedback value);
}