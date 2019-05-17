package robotnik_navigation_msgs;

public interface DockAction extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_navigation_msgs/DockAction";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nDockActionGoal action_goal\nDockActionResult action_result\nDockActionFeedback action_feedback\n";
  robotnik_navigation_msgs.DockActionGoal getActionGoal();
  void setActionGoal(robotnik_navigation_msgs.DockActionGoal value);
  robotnik_navigation_msgs.DockActionResult getActionResult();
  void setActionResult(robotnik_navigation_msgs.DockActionResult value);
  robotnik_navigation_msgs.DockActionFeedback getActionFeedback();
  void setActionFeedback(robotnik_navigation_msgs.DockActionFeedback value);
}