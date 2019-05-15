package stdr_msgs;

public interface SoundSensorMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/SoundSensorMsg";
  static final java.lang.String _DEFINITION = "# Sensor description\n\nfloat32 maxRange\nfloat32 frequency\nfloat32 angleSpan\nstring frame_id\n\n# sensor pose, relative to robot center\ngeometry_msgs/Pose2D pose \n";
  float getMaxRange();
  void setMaxRange(float value);
  float getFrequency();
  void setFrequency(float value);
  float getAngleSpan();
  void setAngleSpan(float value);
  java.lang.String getFrameId();
  void setFrameId(java.lang.String value);
  geometry_msgs.Pose2D getPose();
  void setPose(geometry_msgs.Pose2D value);
}
