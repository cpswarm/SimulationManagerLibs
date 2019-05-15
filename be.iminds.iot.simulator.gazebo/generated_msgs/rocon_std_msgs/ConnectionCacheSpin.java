package rocon_std_msgs;

public interface ConnectionCacheSpin extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_std_msgs/ConnectionCacheSpin";
  static final java.lang.String _DEFINITION = "float32 spin_freq  # Hz\nfloat32 spin_timer  # > 0 means spin_freq is a temporary spin up. ==0 means spin_freq is the base spin frequency";
  float getSpinFreq();
  void setSpinFreq(float value);
  float getSpinTimer();
  void setSpinTimer(float value);
}
