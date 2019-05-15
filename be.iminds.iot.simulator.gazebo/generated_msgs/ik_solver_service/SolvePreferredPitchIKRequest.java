package ik_solver_service;

public interface SolvePreferredPitchIKRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ik_solver_service/SolvePreferredPitchIKRequest";
  static final java.lang.String _DEFINITION = "float64 \tpreferred_pitch\nfloat64[3] \tdes_position\nfloat64[3] \tdes_normal\n";
  double getPreferredPitch();
  void setPreferredPitch(double value);
  double[] getDesPosition();
  void setDesPosition(double[] value);
  double[] getDesNormal();
  void setDesNormal(double[] value);
}
