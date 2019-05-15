package moveit_msgs;

public interface GetPlannerParamsRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetPlannerParamsRequest";
  static final java.lang.String _DEFINITION = "# Name of planning config\nstring planner_config\n\n# Optional name of planning group (return global defaults if empty)\nstring group\n\n";
  java.lang.String getPlannerConfig();
  void setPlannerConfig(java.lang.String value);
  java.lang.String getGroup();
  void setGroup(java.lang.String value);
}
