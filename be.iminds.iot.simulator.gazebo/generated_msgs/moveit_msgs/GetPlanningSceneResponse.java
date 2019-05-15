package moveit_msgs;

public interface GetPlanningSceneResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetPlanningSceneResponse";
  static final java.lang.String _DEFINITION = "PlanningScene scene";
  moveit_msgs.PlanningScene getScene();
  void setScene(moveit_msgs.PlanningScene value);
}
