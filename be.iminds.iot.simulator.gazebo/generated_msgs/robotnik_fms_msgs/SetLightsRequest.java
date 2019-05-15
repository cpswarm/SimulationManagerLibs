package robotnik_fms_msgs;

public interface SetLightsRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/SetLightsRequest";
  static final java.lang.String _DEFINITION = "bool setRed\nbool setGreen\nbool blinkRed\nbool blinkGreen\n\n";
  boolean getSetRed();
  void setSetRed(boolean value);
  boolean getSetGreen();
  void setSetGreen(boolean value);
  boolean getBlinkRed();
  void setBlinkRed(boolean value);
  boolean getBlinkGreen();
  void setBlinkGreen(boolean value);
}
