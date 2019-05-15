package franka_example_controllers;

public interface JointTorqueComparison extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "franka_example_controllers/JointTorqueComparison";
  static final java.lang.String _DEFINITION = "float64[7] tau_error\nfloat64[7] tau_commanded\nfloat64[7] tau_measured\nfloat64 root_mean_square_error\n";
  double[] getTauError();
  void setTauError(double[] value);
  double[] getTauCommanded();
  void setTauCommanded(double[] value);
  double[] getTauMeasured();
  void setTauMeasured(double[] value);
  double getRootMeanSquareError();
  void setRootMeanSquareError(double value);
}
