package yocs_msgs;

public interface LocalizeActionFeedback extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/LocalizeActionFeedback";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nHeader header\nactionlib_msgs/GoalStatus status\nLocalizeFeedback feedback\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalStatus getStatus();
  void setStatus(actionlib_msgs.GoalStatus value);
  yocs_msgs.LocalizeFeedback getFeedback();
  void setFeedback(yocs_msgs.LocalizeFeedback value);
}