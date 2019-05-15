package ar_track_alvar_msgs;

public interface AlvarMarker extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ar_track_alvar_msgs/AlvarMarker";
  static final java.lang.String _DEFINITION = "Header header\nuint32 id\nuint32 confidence\ngeometry_msgs/PoseStamped pose\n\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  int getId();
  void setId(int value);
  int getConfidence();
  void setConfidence(int value);
  geometry_msgs.PoseStamped getPose();
  void setPose(geometry_msgs.PoseStamped value);
}
