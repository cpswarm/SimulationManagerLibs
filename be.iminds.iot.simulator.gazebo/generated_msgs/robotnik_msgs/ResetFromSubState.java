package robotnik_msgs;

public interface ResetFromSubState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/ResetFromSubState";
  static final java.lang.String _DEFINITION = "#new substate\nint32 subState\n\n---\n\n# substate of the component when change\nint32 currentSubState\n\n# The change is correct\nbool success\n\n# Text message - additional status information\nstring msg\n";
}
