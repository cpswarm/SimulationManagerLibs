package robotnik_fms_msgs;

public interface DoorsRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/DoorsRequest";
  static final java.lang.String _DEFINITION = "bool open\nbool close\nint32 door_id\nstring zone\n\n";
  boolean getOpen();
  void setOpen(boolean value);
  boolean getClose();
  void setClose(boolean value);
  int getDoorId();
  void setDoorId(int value);
  java.lang.String getZone();
  void setZone(java.lang.String value);
}
