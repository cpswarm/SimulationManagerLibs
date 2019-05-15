package stdr_msgs;

public interface SonarSensorMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/SonarSensorMsg";
  static final java.lang.String _DEFINITION = "# Rfid sensor description\nfloat32 maxRange\nfloat32 minRange\nfloat32 coneAngle\n\nfloat32 frequency\nstdr_msgs/Noise noise\n\nstring frame_id\ngeometry_msgs/Pose2D pose # sensor pose, relative to robot center\n";
  float getMaxRange();
  void setMaxRange(float value);
  float getMinRange();
  void setMinRange(float value);
  float getConeAngle();
  void setConeAngle(float value);
  float getFrequency();
  void setFrequency(float value);
  stdr_msgs.Noise getNoise();
  void setNoise(stdr_msgs.Noise value);
  java.lang.String getFrameId();
  void setFrameId(java.lang.String value);
  geometry_msgs.Pose2D getPose();
  void setPose(geometry_msgs.Pose2D value);
}
