package rocon_app_manager_msgs;

public interface StopRapp extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_app_manager_msgs/StopRapp";
  static final java.lang.String _DEFINITION = "---\n# true if app stopped, false otherwise\nbool stopped\n# classifying start success/failure, see ErrorCodes.msg\nint32 error_code\n# human friendly string for debugging (usually upon error)\nstring message\n\n";
}
