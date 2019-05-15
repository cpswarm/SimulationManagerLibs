package franka_gripper;

public interface GraspGoal extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "franka_gripper/GraspGoal";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\nfloat64 width # [m]\nGraspEpsilon epsilon\nfloat64 speed # [m/s]\nfloat64 force # [N]\n";
  double getWidth();
  void setWidth(double value);
  franka_gripper.GraspEpsilon getEpsilon();
  void setEpsilon(franka_gripper.GraspEpsilon value);
  double getSpeed();
  void setSpeed(double value);
  double getForce();
  void setForce(double value);
}
