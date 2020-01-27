package stdr_msgs;

public interface SpawnRobotAction extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/SpawnRobotAction";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nSpawnRobotActionGoal action_goal\nSpawnRobotActionResult action_result\nSpawnRobotActionFeedback action_feedback\n";
  stdr_msgs.SpawnRobotActionGoal getActionGoal();
  void setActionGoal(stdr_msgs.SpawnRobotActionGoal value);
  stdr_msgs.SpawnRobotActionResult getActionResult();
  void setActionResult(stdr_msgs.SpawnRobotActionResult value);
  stdr_msgs.SpawnRobotActionFeedback getActionFeedback();
  void setActionFeedback(stdr_msgs.SpawnRobotActionFeedback value);
}