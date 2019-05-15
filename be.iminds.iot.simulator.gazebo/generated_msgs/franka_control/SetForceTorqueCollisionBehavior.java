package franka_control;

public interface SetForceTorqueCollisionBehavior extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "franka_control/SetForceTorqueCollisionBehavior";
  static final java.lang.String _DEFINITION = "float64[7] lower_torque_thresholds_nominal\nfloat64[7] upper_torque_thresholds_nominal\nfloat64[6] lower_force_thresholds_nominal\nfloat64[6] upper_force_thresholds_nominal\n---\nbool success\nstring error\n\n";
}
