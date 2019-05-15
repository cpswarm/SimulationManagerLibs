package world_canvas_msgs;

public interface SetRelationship extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/SetRelationship";
  static final java.lang.String _DEFINITION = "# Add/remove a specific relationship to the specified annotation\nuint8 ADD = 1\nuint8 DEL = 2\n\nuuid_msgs/UniqueID id\nuuid_msgs/UniqueID relationship\nuint8 action\n---\n# What went wrong, if anything\nbool result\nstring message\n";
}
