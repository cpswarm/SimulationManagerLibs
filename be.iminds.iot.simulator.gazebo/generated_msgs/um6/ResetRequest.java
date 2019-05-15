package um6;

public interface ResetRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "um6/ResetRequest";
  static final java.lang.String _DEFINITION = "bool zero_gyros\nbool reset_ekf\nbool set_mag_ref\nbool set_accel_ref\n";
  boolean getZeroGyros();
  void setZeroGyros(boolean value);
  boolean getResetEkf();
  void setResetEkf(boolean value);
  boolean getSetMagRef();
  void setSetMagRef(boolean value);
  boolean getSetAccelRef();
  void setSetAccelRef(boolean value);
}
