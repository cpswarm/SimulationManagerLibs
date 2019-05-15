package mavros_msgs;

public interface CommandHome extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/CommandHome";
  static final java.lang.String _DEFINITION = "# request set new home position\n\nbool current_gps\nfloat32 latitude\nfloat32 longitude\nfloat32 altitude\n---\nbool success\nuint8 result\n";
}
