package franka_control;

public interface SetEEFrameRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "franka_control/SetEEFrameRequest";
  static final java.lang.String _DEFINITION = "float64[16] F_T_EE\n";
  double[] getFTEE();
  void setFTEE(double[] value);
}
