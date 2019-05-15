package mavros_msgs;

public interface HilSensor extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/HilSensor";
  static final java.lang.String _DEFINITION = "# HilSensor.msg\n#\n# ROS representation of MAVLink HIL_SENSOR\n# See mavlink message documentation here:\n# https://pixhawk.ethz.ch/mavlink/#HIL_SENSOR\n\nstd_msgs/Header header\n\ngeometry_msgs/Vector3 acc\ngeometry_msgs/Vector3 gyro\ngeometry_msgs/Vector3 mag\nfloat32 abs_pressure\nfloat32 diff_pressure\nfloat32 pressure_alt\nfloat32 temperature\nuint32 fields_updated\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Vector3 getAcc();
  void setAcc(geometry_msgs.Vector3 value);
  geometry_msgs.Vector3 getGyro();
  void setGyro(geometry_msgs.Vector3 value);
  geometry_msgs.Vector3 getMag();
  void setMag(geometry_msgs.Vector3 value);
  float getAbsPressure();
  void setAbsPressure(float value);
  float getDiffPressure();
  void setDiffPressure(float value);
  float getPressureAlt();
  void setPressureAlt(float value);
  float getTemperature();
  void setTemperature(float value);
  int getFieldsUpdated();
  void setFieldsUpdated(int value);
}
