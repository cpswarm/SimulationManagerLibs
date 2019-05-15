package franka_control;

public interface SetLoad extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "franka_control/SetLoad";
  static final java.lang.String _DEFINITION = "float64 mass\nfloat64[3] F_x_center_load\nfloat64[9] load_inertia\n---\nbool success\nstring error\n\n";
}
