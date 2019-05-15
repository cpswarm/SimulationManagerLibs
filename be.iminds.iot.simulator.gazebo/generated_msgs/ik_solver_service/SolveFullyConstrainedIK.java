package ik_solver_service;

public interface SolveFullyConstrainedIK extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ik_solver_service/SolveFullyConstrainedIK";
  static final java.lang.String _DEFINITION = "uint8 \t\tid\nfloat64 \tpitch\nfloat64[3] \tdes_position\nfloat64[3] \tdes_normal\n---\nfloat64[5] \tjoint_angles\nbool \t\tfeasible\nbool \t\tarm_to_front\nbool \t\tarm_bended_up\nbool \t\tgripper_downwards";
}
