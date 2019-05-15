package franka_control;

public interface SetLoadRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "franka_control/SetLoadRequest";
  static final java.lang.String _DEFINITION = "float64 mass\nfloat64[3] F_x_center_load\nfloat64[9] load_inertia\n";
  double getMass();
  void setMass(double value);
  double[] getFXCenterLoad();
  void setFXCenterLoad(double[] value);
  double[] getLoadInertia();
  void setLoadInertia(double[] value);
}
