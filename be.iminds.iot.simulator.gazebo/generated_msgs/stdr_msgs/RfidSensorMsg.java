package stdr_msgs;

public interface RfidSensorMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/RfidSensorMsg";
  static final java.lang.String _DEFINITION = "# Rfid sensor description\nfloat32 maxRange\nfloat32 angleSpan\nfloat32 signalCutoff\n\nfloat32 frequency\n\nstring frame_id\ngeometry_msgs/Pose2D pose # sensor pose, relative to robot center\n";
  float getMaxRange();
  void setMaxRange(float value);
  float getAngleSpan();
  void setAngleSpan(float value);
  float getSignalCutoff();
  void setSignalCutoff(float value);
  float getFrequency();
  void setFrequency(float value);
  java.lang.String getFrameId();
  void setFrameId(java.lang.String value);
  geometry_msgs.Pose2D getPose();
  void setPose(geometry_msgs.Pose2D value);
}
