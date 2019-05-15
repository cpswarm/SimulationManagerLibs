package robotnik_fms_msgs;

public interface DoorStatusArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/DoorStatusArray";
  static final java.lang.String _DEFINITION = "robotnik_fms_msgs/DoorStatus[] Doors\n";
  java.util.List<robotnik_fms_msgs.DoorStatus> getDoors();
  void setDoors(java.util.List<robotnik_fms_msgs.DoorStatus> value);
}
