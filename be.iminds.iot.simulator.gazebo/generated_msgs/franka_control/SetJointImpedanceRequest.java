package franka_control;

public interface SetJointImpedanceRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "franka_control/SetJointImpedanceRequest";
  static final java.lang.String _DEFINITION = "float64[7] joint_stiffness\n";
  double[] getJointStiffness();
  void setJointStiffness(double[] value);
}
