package ik_solver_service;

public interface SolveFullyConstrainedIKArrayRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ik_solver_service/SolveFullyConstrainedIKArrayRequest";
  static final java.lang.String _DEFINITION = "FullyConstrainedReq[] ikarray\n";
  java.util.List<ik_solver_service.FullyConstrainedReq> getIkarray();
  void setIkarray(java.util.List<ik_solver_service.FullyConstrainedReq> value);
}
