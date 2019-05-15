package stdr_msgs;

public interface ThermalSensorMeasurementMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/ThermalSensorMeasurementMsg";
  static final java.lang.String _DEFINITION = "# Sensor measurement description\n\nHeader header\n\nfloat32[] thermal_source_degrees\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float[] getThermalSourceDegrees();
  void setThermalSourceDegrees(float[] value);
}
