package moveit_msgs;

public interface GraspPlanningResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GraspPlanningResponse";
  static final java.lang.String _DEFINITION = "\n# the list of planned grasps\nGrasp[] grasps\n\n# whether an error occurred\nMoveItErrorCodes error_code";
  java.util.List<moveit_msgs.Grasp> getGrasps();
  void setGrasps(java.util.List<moveit_msgs.Grasp> value);
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
}
