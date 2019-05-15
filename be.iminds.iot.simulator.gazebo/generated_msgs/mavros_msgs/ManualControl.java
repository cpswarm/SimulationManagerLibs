package mavros_msgs;

public interface ManualControl extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/ManualControl";
  static final java.lang.String _DEFINITION = "# Manual Control state\nstd_msgs/Header header\nfloat32 x\nfloat32 y\nfloat32 z\nfloat32 r\nuint16 buttons\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getX();
  void setX(float value);
  float getY();
  void setY(float value);
  float getZ();
  void setZ(float value);
  float getR();
  void setR(float value);
  short getButtons();
  void setButtons(short value);
}
