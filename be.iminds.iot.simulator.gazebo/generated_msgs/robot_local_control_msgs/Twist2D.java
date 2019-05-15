package robot_local_control_msgs;

public interface Twist2D extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/Twist2D";
  static final java.lang.String _DEFINITION = "float64 linear_x\nfloat64 linear_y\nfloat64 angular_z\n";
  double getLinearX();
  void setLinearX(double value);
  double getLinearY();
  void setLinearY(double value);
  double getAngularZ();
  void setAngularZ(double value);
}
