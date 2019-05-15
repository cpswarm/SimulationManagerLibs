package robot_local_control_msgs;

public interface SetGoToPetition extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/SetGoToPetition";
  static final java.lang.String _DEFINITION = "string action_namespace  # this will be the new action_namespace of the move_base client\nstring frame_id          # the new global frame_id\n---\nbool success   # indicate successful run of triggered service\nstring message # informational, e.g. for error messages\n";
}
