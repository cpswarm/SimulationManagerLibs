package ik_solver_service;

public interface SolveFullyConstrainedIKResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ik_solver_service/SolveFullyConstrainedIKResponse";
  static final java.lang.String _DEFINITION = "float64[5] \tjoint_angles\nbool \t\tfeasible\nbool \t\tarm_to_front\nbool \t\tarm_bended_up\nbool \t\tgripper_downwards";
  double[] getJointAngles();
  void setJointAngles(double[] value);
  boolean getFeasible();
  void setFeasible(boolean value);
  boolean getArmToFront();
  void setArmToFront(boolean value);
  boolean getArmBendedUp();
  void setArmBendedUp(boolean value);
  boolean getGripperDownwards();
  void setGripperDownwards(boolean value);
}
