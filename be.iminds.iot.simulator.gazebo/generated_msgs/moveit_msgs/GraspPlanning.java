package moveit_msgs;

public interface GraspPlanning extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GraspPlanning";
  static final java.lang.String _DEFINITION = "# Requests that grasp planning be performed for the target object\n# returns a list of candidate grasps to be tested and executed\n\n# the planning group used\nstring group_name\n\n# the object to be grasped\nCollisionObject target\n\n# the names of the relevant support surfaces (e.g. tables) in the collision map\n# can be left empty if no names are available\nstring[] support_surfaces\n\n# an optional list of grasps to be evaluated by the planner\nGrasp[] candidate_grasps\n\n# an optional list of obstacles that we have semantic information about\n# and that can be moved in the course of grasping\nCollisionObject[] movable_obstacles\n\n---\n\n# the list of planned grasps\nGrasp[] grasps\n\n# whether an error occurred\nMoveItErrorCodes error_code\n";
}
