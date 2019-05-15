package microstrain_3dmgx2_imu;

public interface AddOffsetResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "microstrain_3dmgx2_imu/AddOffsetResponse";
  static final java.lang.String _DEFINITION = "float64 total_offset";
  double getTotalOffset();
  void setTotalOffset(double value);
}
