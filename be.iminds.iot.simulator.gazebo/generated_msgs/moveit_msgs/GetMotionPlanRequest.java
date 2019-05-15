package moveit_msgs;

public interface GetMotionPlanRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetMotionPlanRequest";
  static final java.lang.String _DEFINITION = "# This service contains the definition for a request to the motion\n# planner and the output it provides\n\nMotionPlanRequest motion_plan_request\n\n";
  moveit_msgs.MotionPlanRequest getMotionPlanRequest();
  void setMotionPlanRequest(moveit_msgs.MotionPlanRequest value);
}
