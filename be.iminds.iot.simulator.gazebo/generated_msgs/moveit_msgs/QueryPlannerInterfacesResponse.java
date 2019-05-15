package moveit_msgs;

public interface QueryPlannerInterfacesResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/QueryPlannerInterfacesResponse";
  static final java.lang.String _DEFINITION = "\n# The planning instances that could be used in the benchmark\nPlannerInterfaceDescription[] planner_interfaces";
  java.util.List<moveit_msgs.PlannerInterfaceDescription> getPlannerInterfaces();
  void setPlannerInterfaces(java.util.List<moveit_msgs.PlannerInterfaceDescription> value);
}
