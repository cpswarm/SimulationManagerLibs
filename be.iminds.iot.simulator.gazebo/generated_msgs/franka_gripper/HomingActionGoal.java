package franka_gripper;

public interface HomingActionGoal extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "franka_gripper/HomingActionGoal";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nHeader header\nactionlib_msgs/GoalID goal_id\nHomingGoal goal\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalID getGoalId();
  void setGoalId(actionlib_msgs.GoalID value);
  franka_gripper.HomingGoal getGoal();
  void setGoal(franka_gripper.HomingGoal value);
}
