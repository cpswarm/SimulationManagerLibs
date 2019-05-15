package multimaster_msgs_fkie;

public interface LinkState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs_fkie/LinkState";
  static final java.lang.String _DEFINITION = "string destination\nfloat32 quality";
  java.lang.String getDestination();
  void setDestination(java.lang.String value);
  float getQuality();
  void setQuality(float value);
}
