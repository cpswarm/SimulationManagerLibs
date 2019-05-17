package franka_control;

public interface ErrorRecoveryActionResult extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "franka_control/ErrorRecoveryActionResult";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nHeader header\nactionlib_msgs/GoalStatus status\nErrorRecoveryResult result\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalStatus getStatus();
  void setStatus(actionlib_msgs.GoalStatus value);
  franka_control.ErrorRecoveryResult getResult();
  void setResult(franka_control.ErrorRecoveryResult value);
}