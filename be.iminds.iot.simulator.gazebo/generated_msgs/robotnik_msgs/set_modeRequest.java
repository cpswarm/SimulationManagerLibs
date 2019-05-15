package robotnik_msgs;

public interface set_modeRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/set_modeRequest";
  static final java.lang.String _DEFINITION = "# Set control / kinematic / etc. mode\nint8 mode\n";
  byte getMode();
  void setMode(byte value);
}
