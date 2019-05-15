package ik_solver_service;

public interface SolveClosestIKRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ik_solver_service/SolveClosestIKRequest";
  static final java.lang.String _DEFINITION = "float64[5] \tjoint_angles\nfloat64[3] \tdes_position\nfloat64[3] \tdes_normal\n";
  double[] getJointAngles();
  void setJointAngles(double[] value);
  double[] getDesPosition();
  void setDesPosition(double[] value);
  double[] getDesNormal();
  void setDesNormal(double[] value);
}
