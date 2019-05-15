package yocs_msgs;

public interface ARPair extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/ARPair";
  static final java.lang.String _DEFINITION = "int16  left_id\nint16  right_id\nfloat32 baseline\nfloat32 target_offset\nstring  target_frame\n";
  short getLeftId();
  void setLeftId(short value);
  short getRightId();
  void setRightId(short value);
  float getBaseline();
  void setBaseline(float value);
  float getTargetOffset();
  void setTargetOffset(float value);
  java.lang.String getTargetFrame();
  void setTargetFrame(java.lang.String value);
}
