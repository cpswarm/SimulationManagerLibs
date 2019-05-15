package robotnik_fms_msgs;

public interface DoorStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/DoorStatus";
  static final java.lang.String _DEFINITION = "bool open\nbool closed\nint32 door_id\nstring zone\n";
  boolean getOpen();
  void setOpen(boolean value);
  boolean getClosed();
  void setClosed(boolean value);
  int getDoorId();
  void setDoorId(int value);
  java.lang.String getZone();
  void setZone(java.lang.String value);
}
