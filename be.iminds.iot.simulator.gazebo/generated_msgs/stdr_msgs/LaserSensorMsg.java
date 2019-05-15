package stdr_msgs;

public interface LaserSensorMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/LaserSensorMsg";
  static final java.lang.String _DEFINITION = "# Laser Sensor description\nfloat32 maxAngle\nfloat32 minAngle\nfloat32 maxRange\nfloat32 minRange\nint32 numRays\n\nstdr_msgs/Noise noise\n\nfloat32 frequency\n\nstring frame_id\ngeometry_msgs/Pose2D pose # sensor pose, relative to robot center\n";
  float getMaxAngle();
  void setMaxAngle(float value);
  float getMinAngle();
  void setMinAngle(float value);
  float getMaxRange();
  void setMaxRange(float value);
  float getMinRange();
  void setMinRange(float value);
  int getNumRays();
  void setNumRays(int value);
  stdr_msgs.Noise getNoise();
  void setNoise(stdr_msgs.Noise value);
  float getFrequency();
  void setFrequency(float value);
  java.lang.String getFrameId();
  void setFrameId(java.lang.String value);
  geometry_msgs.Pose2D getPose();
  void setPose(geometry_msgs.Pose2D value);
}
