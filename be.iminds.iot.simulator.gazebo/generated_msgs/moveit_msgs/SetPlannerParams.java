package moveit_msgs;

public interface SetPlannerParams extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/SetPlannerParams";
  static final java.lang.String _DEFINITION = "# Name of planning config\nstring planner_config\n\n# Optional name of planning group (set global defaults if empty)\nstring group\n\n# parameters as key-value pairs\nPlannerParams params\n\n# replace params or augment existing ones?\nbool replace\n\n---\n\n";
}
