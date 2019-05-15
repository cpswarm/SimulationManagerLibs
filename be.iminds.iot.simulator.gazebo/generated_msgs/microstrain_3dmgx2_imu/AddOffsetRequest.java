package microstrain_3dmgx2_imu;

public interface AddOffsetRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "microstrain_3dmgx2_imu/AddOffsetRequest";
  static final java.lang.String _DEFINITION = "float64 add_offset\n";
  double getAddOffset();
  void setAddOffset(double value);
}
