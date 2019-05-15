package mavros_msgs;

public interface Vibration extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/Vibration";
  static final java.lang.String _DEFINITION = "# VIBRATION message data\n# @description: Vibration levels and accelerometer clipping\n\nstd_msgs/Header header\n\ngeometry_msgs/Vector3 vibration\t\t# 3-axis vibration levels\nfloat32[3] clipping\t\t\t\t# Accelerometers clipping";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Vector3 getVibration();
  void setVibration(geometry_msgs.Vector3 value);
  float[] getClipping();
  void setClipping(float[] value);
}
