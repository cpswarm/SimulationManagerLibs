package stdr_msgs;

public interface RfidTag extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/RfidTag";
  static final java.lang.String _DEFINITION = "# Rfid tag description\n\nstring tag_id\nstring message\ngeometry_msgs/Pose2D pose # sensor pose, relative to the map origin\n";
  java.lang.String getTagId();
  void setTagId(java.lang.String value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
  geometry_msgs.Pose2D getPose();
  void setPose(geometry_msgs.Pose2D value);
}
