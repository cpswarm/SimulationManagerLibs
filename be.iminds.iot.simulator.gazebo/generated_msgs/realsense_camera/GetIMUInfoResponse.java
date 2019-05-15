package realsense_camera;

public interface GetIMUInfoResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "realsense_camera/GetIMUInfoResponse";
  static final java.lang.String _DEFINITION = "IMUInfo accel\nIMUInfo gyro";
  realsense_camera.IMUInfo getAccel();
  void setAccel(realsense_camera.IMUInfo value);
  realsense_camera.IMUInfo getGyro();
  void setGyro(realsense_camera.IMUInfo value);
}
