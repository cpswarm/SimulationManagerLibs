package ik_solver_service;

public interface SolvePreferredTypeIK extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ik_solver_service/SolvePreferredTypeIK";
  static final java.lang.String _DEFINITION = "bool \t\tarm_to_front\nbool \t\tarm_bended_up\nbool \t\tgripper_downwards\nfloat64[3] \tdes_position\nfloat64[3] \tdes_normal\n---\nfloat64[5] \tjoint_angles\nbool \t\tfeasible\nbool \t\tarm_to_front\nbool \t\tarm_bended_up\nbool \t\tgripper_downwards";
}
