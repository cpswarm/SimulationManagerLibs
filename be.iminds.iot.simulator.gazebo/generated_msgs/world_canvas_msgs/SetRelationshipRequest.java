package world_canvas_msgs;

public interface SetRelationshipRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/SetRelationshipRequest";
  static final java.lang.String _DEFINITION = "# Add/remove a specific relationship to the specified annotation\nuint8 ADD = 1\nuint8 DEL = 2\n\nuuid_msgs/UniqueID id\nuuid_msgs/UniqueID relationship\nuint8 action\n";
  static final byte ADD = 1;
  static final byte DEL = 2;
  uuid_msgs.UniqueID getId();
  void setId(uuid_msgs.UniqueID value);
  uuid_msgs.UniqueID getRelationship();
  void setRelationship(uuid_msgs.UniqueID value);
  byte getAction();
  void setAction(byte value);
}
