package robotnik_msgs;

public interface set_heightRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/set_heightRequest";
  static final java.lang.String _DEFINITION = "# New reference position (m)\nfloat32 height\n";
  float getHeight();
  void setHeight(float value);
}
