package object_recognition_msgs;

public interface ObjectRecognitionActionFeedback extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "object_recognition_msgs/ObjectRecognitionActionFeedback";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n\nHeader header\nactionlib_msgs/GoalStatus status\nObjectRecognitionFeedback feedback\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  actionlib_msgs.GoalStatus getStatus();
  void setStatus(actionlib_msgs.GoalStatus value);
  object_recognition_msgs.ObjectRecognitionFeedback getFeedback();
  void setFeedback(object_recognition_msgs.ObjectRecognitionFeedback value);
}