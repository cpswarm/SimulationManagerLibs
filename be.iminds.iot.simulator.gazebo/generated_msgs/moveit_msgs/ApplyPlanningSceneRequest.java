package moveit_msgs;

public interface ApplyPlanningSceneRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/ApplyPlanningSceneRequest";
  static final java.lang.String _DEFINITION = "PlanningScene scene\n";
  moveit_msgs.PlanningScene getScene();
  void setScene(moveit_msgs.PlanningScene value);
}
