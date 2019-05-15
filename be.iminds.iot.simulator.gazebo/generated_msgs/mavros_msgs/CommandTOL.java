package mavros_msgs;

public interface CommandTOL extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/CommandTOL";
  static final java.lang.String _DEFINITION = "# Common type for Take Off and Landing\n\nfloat32 min_pitch\t# used by takeoff\nfloat32 yaw\nfloat32 latitude\nfloat32 longitude\nfloat32 altitude\n---\nbool success\nuint8 result\n";
}
