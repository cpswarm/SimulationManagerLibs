package robot_localization;

public interface GetStateResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_localization/GetStateResponse";
  static final java.lang.String _DEFINITION = "# State vector: x, y, z, roll, pitch, yaw, vx, vy, vz, vroll, vpitch, vyaw, ax, ay, az\nfloat64[15] state\n\n# Covariance matrix in row-major order\nfloat64[225] covariance";
  double[] getState();
  void setState(double[] value);
  double[] getCovariance();
  void setCovariance(double[] value);
}
