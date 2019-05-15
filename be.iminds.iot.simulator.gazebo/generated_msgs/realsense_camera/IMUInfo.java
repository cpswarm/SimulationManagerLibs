package realsense_camera;

public interface IMUInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "realsense_camera/IMUInfo";
  static final java.lang.String _DEFINITION = "# header.frame_id is either set to \"imu_accel\" or \"imu_gyro\"\n# to distinguish between \"accel\" and \"gyro\" info.\nstd_msgs/Header header\nfloat64[12] data\nfloat64[3] noise_variances\nfloat64[3] bias_variances";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  double[] getData();
  void setData(double[] value);
  double[] getNoiseVariances();
  void setNoiseVariances(double[] value);
  double[] getBiasVariances();
  void setBiasVariances(double[] value);
}
