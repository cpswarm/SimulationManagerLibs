package robotnik_msgs;

public interface set_odometryRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/set_odometryRequest";
  static final java.lang.String _DEFINITION = "# New robot X position (m)\nfloat32 x\n# New robot Y position (m)\nfloat32 y\n# New robot Z position (m)\nfloat32 z\n# New robot Orientation (rads)\nfloat32 orientation\n";
  float getX();
  void setX(float value);
  float getY();
  void setY(float value);
  float getZ();
  void setZ(float value);
  float getOrientation();
  void setOrientation(float value);
}
