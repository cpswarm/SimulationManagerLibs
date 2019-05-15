package robot_local_control_msgs;

public interface SetGoToPetitionRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/SetGoToPetitionRequest";
  static final java.lang.String _DEFINITION = "string action_namespace  # this will be the new action_namespace of the move_base client\nstring frame_id          # the new global frame_id\n";
  java.lang.String getActionNamespace();
  void setActionNamespace(java.lang.String value);
  java.lang.String getFrameId();
  void setFrameId(java.lang.String value);
}
