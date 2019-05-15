package ik_solver_service;

public interface SolvePreferredTypeIKRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ik_solver_service/SolvePreferredTypeIKRequest";
  static final java.lang.String _DEFINITION = "bool \t\tarm_to_front\nbool \t\tarm_bended_up\nbool \t\tgripper_downwards\nfloat64[3] \tdes_position\nfloat64[3] \tdes_normal\n";
  boolean getArmToFront();
  void setArmToFront(boolean value);
  boolean getArmBendedUp();
  void setArmBendedUp(boolean value);
  boolean getGripperDownwards();
  void setGripperDownwards(boolean value);
  double[] getDesPosition();
  void setDesPosition(double[] value);
  double[] getDesNormal();
  void setDesNormal(double[] value);
}
