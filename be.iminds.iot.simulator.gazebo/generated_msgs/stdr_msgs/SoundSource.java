package stdr_msgs;

public interface SoundSource extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/SoundSource";
  static final java.lang.String _DEFINITION = "# Source description\n\nstring id\nfloat32 dbs\n\n# sensor pose, relative to the map origin\ngeometry_msgs/Pose2D pose \n";
  java.lang.String getId();
  void setId(java.lang.String value);
  float getDbs();
  void setDbs(float value);
  geometry_msgs.Pose2D getPose();
  void setPose(geometry_msgs.Pose2D value);
}
