package franka_control;

public interface SetKFrameRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "franka_control/SetKFrameRequest";
  static final java.lang.String _DEFINITION = "float64[16] EE_T_K\n";
  double[] getEETK();
  void setEETK(double[] value);
}
