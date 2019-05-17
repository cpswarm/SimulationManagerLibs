package moveit_msgs;

public interface PickupActionFeedback extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/PickupActionFeedback";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nHeader header\nactionlib_msgs/GoalStatus status\nPickupFeedback feedback\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalStatus getStatus();
  void setStatus(actionlib_msgs.GoalStatus value);
  moveit_msgs.PickupFeedback getFeedback();
  void setFeedback(moveit_msgs.PickupFeedback value);
}