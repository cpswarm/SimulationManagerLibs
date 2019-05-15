package world_canvas_msgs;

public interface SetKeywordRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/SetKeywordRequest";
  static final java.lang.String _DEFINITION = "# Add/remove a specific keyword to the specified annotation\nuint8 ADD = 1\nuint8 DEL = 2\n\nuuid_msgs/UniqueID id\nstring keyword\nuint8 action\n";
  static final byte ADD = 1;
  static final byte DEL = 2;
  uuid_msgs.UniqueID getId();
  void setId(uuid_msgs.UniqueID value);
  java.lang.String getKeyword();
  void setKeyword(java.lang.String value);
  byte getAction();
  void setAction(byte value);
}
