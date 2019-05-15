package ik_solver_service;

public interface SolveFullyConstrainedIKArrayResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ik_solver_service/SolveFullyConstrainedIKArrayResponse";
  static final java.lang.String _DEFINITION = "FullyConstrainedRes[] ikresp";
  java.util.List<ik_solver_service.FullyConstrainedRes> getIkresp();
  void setIkresp(java.util.List<ik_solver_service.FullyConstrainedRes> value);
}
