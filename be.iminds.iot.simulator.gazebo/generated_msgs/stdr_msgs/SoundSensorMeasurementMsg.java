package stdr_msgs;

public interface SoundSensorMeasurementMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/SoundSensorMeasurementMsg";
  static final java.lang.String _DEFINITION = "# Sensor measurement description\n# All vectors must have the same size\n\nHeader header\n\nfloat32 sound_dbs\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getSoundDbs();
  void setSoundDbs(float value);
}
