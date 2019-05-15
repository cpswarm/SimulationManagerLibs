package stdr_msgs;

public interface AddRfidTagRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/AddRfidTagRequest";
  static final java.lang.String _DEFINITION = "stdr_msgs/RfidTag newTag\n";
  stdr_msgs.RfidTag getNewTag();
  void setNewTag(stdr_msgs.RfidTag value);
}
