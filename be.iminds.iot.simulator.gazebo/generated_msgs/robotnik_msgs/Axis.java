package robotnik_msgs;

public interface Axis extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/Axis";
  static final java.lang.String _DEFINITION = "float32 pan\nfloat32 tilt\nfloat32 zoom\nfloat32 focus\nfloat32 brightness\nfloat32 iris\nbool autofocus\nbool autoiris\n";
  float getPan();
  void setPan(float value);
  float getTilt();
  void setTilt(float value);
  float getZoom();
  void setZoom(float value);
  float getFocus();
  void setFocus(float value);
  float getBrightness();
  void setBrightness(float value);
  float getIris();
  void setIris(float value);
  boolean getAutofocus();
  void setAutofocus(boolean value);
  boolean getAutoiris();
  void setAutoiris(boolean value);
}
