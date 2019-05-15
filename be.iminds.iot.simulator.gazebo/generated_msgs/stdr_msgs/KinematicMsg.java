package stdr_msgs;

public interface KinematicMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/KinematicMsg";
  static final java.lang.String _DEFINITION = "# Container for the kinematic model parameters. The parameters selected/\n# are quite general. For a more accurate motion model a per-kinematic model\n# approach should be followed.\n# Parameters are in the form a_C_D, where C is affected by D.\n# ux is the linear speed\n# uy is the lateral speed (for omni vehicles)\n# w is the angular speed\n# g is a cofficient that directly affects the angular speed\n# For more information check the MotionController::sampleVelocities function.\n\nstring type\nfloat32 a_ux_ux\nfloat32 a_ux_uy\nfloat32 a_ux_w\nfloat32 a_uy_ux\nfloat32 a_uy_uy\nfloat32 a_uy_w\nfloat32 a_w_ux\nfloat32 a_w_uy\nfloat32 a_w_w\nfloat32 a_g_ux\nfloat32 a_g_uy\nfloat32 a_g_w\n";
  java.lang.String getType();
  void setType(java.lang.String value);
  float getAUxUx();
  void setAUxUx(float value);
  float getAUxUy();
  void setAUxUy(float value);
  float getAUxW();
  void setAUxW(float value);
  float getAUyUx();
  void setAUyUx(float value);
  float getAUyUy();
  void setAUyUy(float value);
  float getAUyW();
  void setAUyW(float value);
  float getAWUx();
  void setAWUx(float value);
  float getAWUy();
  void setAWUy(float value);
  float getAWW();
  void setAWW(float value);
  float getAGUx();
  void setAGUx(float value);
  float getAGUy();
  void setAGUy(float value);
  float getAGW();
  void setAGW(float value);
}
