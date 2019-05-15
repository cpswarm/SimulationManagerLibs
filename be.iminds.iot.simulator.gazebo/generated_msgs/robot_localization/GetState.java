package robot_localization;

public interface GetState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_localization/GetState";
  static final java.lang.String _DEFINITION = "time time_stamp\nstring frame_id\n---\n# State vector: x, y, z, roll, pitch, yaw, vx, vy, vz, vroll, vpitch, vyaw, ax, ay, az\nfloat64[15] state\n\n# Covariance matrix in row-major order\nfloat64[225] covariance\n";
}
