package um7;

public interface ResetRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "um7/ResetRequest";
  static final java.lang.String _DEFINITION = "bool zero_gyros\nbool reset_ekf\nbool set_mag_ref\n";
  boolean getZeroGyros();
  void setZeroGyros(boolean value);
  boolean getResetEkf();
  void setResetEkf(boolean value);
  boolean getSetMagRef();
  void setSetMagRef(boolean value);
}
