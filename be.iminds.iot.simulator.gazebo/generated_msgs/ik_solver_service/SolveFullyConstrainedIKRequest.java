package ik_solver_service;

public interface SolveFullyConstrainedIKRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ik_solver_service/SolveFullyConstrainedIKRequest";
  static final java.lang.String _DEFINITION = "uint8 \t\tid\nfloat64 \tpitch\nfloat64[3] \tdes_position\nfloat64[3] \tdes_normal\n";
  byte getId();
  void setId(byte value);
  double getPitch();
  void setPitch(double value);
  double[] getDesPosition();
  void setDesPosition(double[] value);
  double[] getDesNormal();
  void setDesNormal(double[] value);
}
