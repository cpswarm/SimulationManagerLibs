package moveit_msgs;

public interface GetPlannerParamsResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetPlannerParamsResponse";
  static final java.lang.String _DEFINITION = "\n# parameters as key-value pairs\nPlannerParams params";
  moveit_msgs.PlannerParams getParams();
  void setParams(moveit_msgs.PlannerParams value);
}
