package ik_solver_service;

public interface SolvePreferredPitchIK extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ik_solver_service/SolvePreferredPitchIK";
  static final java.lang.String _DEFINITION = "float64 \tpreferred_pitch\nfloat64[3] \tdes_position\nfloat64[3] \tdes_normal\n---\nfloat64[5] \tjoint_angles\nbool \t\tfeasible\nbool \t\tarm_to_front\nbool \t\tarm_bended_up\nbool \t\tgripper_downwards";
}
