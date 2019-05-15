package create_node;

public interface Drive extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "create_node/Drive";
  static final java.lang.String _DEFINITION = "float32 velocity\nfloat32 radius\n";
  float getVelocity();
  void setVelocity(float value);
  float getRadius();
  void setRadius(float value);
}
