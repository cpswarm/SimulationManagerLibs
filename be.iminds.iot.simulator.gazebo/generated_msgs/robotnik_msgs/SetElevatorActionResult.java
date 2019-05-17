package robotnik_msgs;

public interface SetElevatorActionResult extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/SetElevatorActionResult";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nHeader header\nactionlib_msgs/GoalStatus status\nSetElevatorResult result\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalStatus getStatus();
  void setStatus(actionlib_msgs.GoalStatus value);
  robotnik_msgs.SetElevatorResult getResult();
  void setResult(robotnik_msgs.SetElevatorResult value);
}