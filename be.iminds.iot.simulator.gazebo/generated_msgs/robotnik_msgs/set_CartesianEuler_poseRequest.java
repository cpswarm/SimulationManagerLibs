package robotnik_msgs;

public interface set_CartesianEuler_poseRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/set_CartesianEuler_poseRequest";
  static final java.lang.String _DEFINITION = "# New robot X position (mm)\nfloat32 x\n# New robot Y position (mm)\nfloat32 y\n# New robot Z position (mm)\nfloat32 z\n# New robot Orientation (grad)\nfloat32 A\n# New robot Orientation (grad)\nfloat32 B\n# New robot Orientation (grad)\nfloat32 C\n";
  float getX();
  void setX(float value);
  float getY();
  void setY(float value);
  float getZ();
  void setZ(float value);
  float getA();
  void setA(float value);
  float getB();
  void setB(float value);
  float getC();
  void setC(float value);
}
