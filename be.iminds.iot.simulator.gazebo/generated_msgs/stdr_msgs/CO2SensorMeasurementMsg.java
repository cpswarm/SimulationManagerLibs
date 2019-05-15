package stdr_msgs;

public interface CO2SensorMeasurementMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/CO2SensorMeasurementMsg";
  static final java.lang.String _DEFINITION = "# Sensor measurement description\n# All vectors must have the same size\n\nHeader header\n\nfloat32 co2_ppm\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getCo2Ppm();
  void setCo2Ppm(float value);
}
