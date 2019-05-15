package moveit_msgs;

public interface GetPlannerParams extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetPlannerParams";
  static final java.lang.String _DEFINITION = "# Name of planning config\nstring planner_config\n\n# Optional name of planning group (return global defaults if empty)\nstring group\n\n---\n\n# parameters as key-value pairs\nPlannerParams params\n";
}
