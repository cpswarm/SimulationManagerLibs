package franka_gripper;

public interface GraspEpsilon extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "franka_gripper/GraspEpsilon";
  static final java.lang.String _DEFINITION = "float64 inner # [m]\nfloat64 outer # [m]\n";
  double getInner();
  void setInner(double value);
  double getOuter();
  void setOuter(double value);
}
