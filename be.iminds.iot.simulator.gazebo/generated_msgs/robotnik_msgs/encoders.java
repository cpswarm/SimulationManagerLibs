package robotnik_msgs;

public interface encoders extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/encoders";
  static final java.lang.String _DEFINITION = "# 0-> right incremental, 1-> left incremental, 2-> steer absolute\nstring[] type\nint32[] counts\nint32[] vel\n";
  java.util.List<java.lang.String> getType();
  void setType(java.util.List<java.lang.String> value);
  int[] getCounts();
  void setCounts(int[] value);
  int[] getVel();
  void setVel(int[] value);
}
