package stdr_msgs;

public interface Noise extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/Noise";
  static final java.lang.String _DEFINITION = "bool noise\nfloat32 noiseMean\nfloat32 noiseStd\n";
  boolean getNoise();
  void setNoise(boolean value);
  float getNoiseMean();
  void setNoiseMean(float value);
  float getNoiseStd();
  void setNoiseStd(float value);
}
