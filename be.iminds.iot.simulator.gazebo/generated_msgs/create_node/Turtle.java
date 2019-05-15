package create_node;

public interface Turtle extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "create_node/Turtle";
  static final java.lang.String _DEFINITION = "float32 linear\nfloat32 angular";
  float getLinear();
  void setLinear(float value);
  float getAngular();
  void setAngular(float value);
}
