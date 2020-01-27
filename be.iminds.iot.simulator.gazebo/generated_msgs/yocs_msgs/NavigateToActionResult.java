package yocs_msgs;

public interface NavigateToActionResult extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/NavigateToActionResult";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nHeader header\nactionlib_msgs/GoalStatus status\nNavigateToResult result\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalStatus getStatus();
  void setStatus(actionlib_msgs.GoalStatus value);
  yocs_msgs.NavigateToResult getResult();
  void setResult(yocs_msgs.NavigateToResult value);
}