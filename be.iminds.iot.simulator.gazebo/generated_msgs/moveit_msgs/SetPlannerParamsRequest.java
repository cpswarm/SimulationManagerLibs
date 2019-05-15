package moveit_msgs;

public interface SetPlannerParamsRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/SetPlannerParamsRequest";
  static final java.lang.String _DEFINITION = "# Name of planning config\nstring planner_config\n\n# Optional name of planning group (set global defaults if empty)\nstring group\n\n# parameters as key-value pairs\nPlannerParams params\n\n# replace params or augment existing ones?\nbool replace\n\n";
  java.lang.String getPlannerConfig();
  void setPlannerConfig(java.lang.String value);
  java.lang.String getGroup();
  void setGroup(java.lang.String value);
  moveit_msgs.PlannerParams getParams();
  void setParams(moveit_msgs.PlannerParams value);
  boolean getReplace();
  void setReplace(boolean value);
}
