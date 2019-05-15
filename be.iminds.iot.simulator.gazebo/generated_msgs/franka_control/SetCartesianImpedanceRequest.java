package franka_control;

public interface SetCartesianImpedanceRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "franka_control/SetCartesianImpedanceRequest";
  static final java.lang.String _DEFINITION = "float64[6] cartesian_stiffness\n";
  double[] getCartesianStiffness();
  void setCartesianStiffness(double[] value);
}
