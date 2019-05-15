package mavros_msgs;

public interface CommandIntResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/CommandIntResponse";
  static final java.lang.String _DEFINITION = "bool success\n# seems that this message don\'t produce andy COMMAND_ACK messages\n# so no result field";
  boolean getSuccess();
  void setSuccess(boolean value);
}
