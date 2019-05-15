package mavros_msgs;

public interface CommandTOLRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/CommandTOLRequest";
  static final java.lang.String _DEFINITION = "# Common type for Take Off and Landing\n\nfloat32 min_pitch\t# used by takeoff\nfloat32 yaw\nfloat32 latitude\nfloat32 longitude\nfloat32 altitude\n";
  float getMinPitch();
  void setMinPitch(float value);
  float getYaw();
  void setYaw(float value);
  float getLatitude();
  void setLatitude(float value);
  float getLongitude();
  void setLongitude(float value);
  float getAltitude();
  void setAltitude(float value);
}
