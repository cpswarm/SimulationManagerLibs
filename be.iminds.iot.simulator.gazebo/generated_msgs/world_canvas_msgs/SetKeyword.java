package world_canvas_msgs;

public interface SetKeyword extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/SetKeyword";
  static final java.lang.String _DEFINITION = "# Add/remove a specific keyword to the specified annotation\nuint8 ADD = 1\nuint8 DEL = 2\n\nuuid_msgs/UniqueID id\nstring keyword\nuint8 action\n---\n# What went wrong, if anything\nbool result\nstring message\n";
}
