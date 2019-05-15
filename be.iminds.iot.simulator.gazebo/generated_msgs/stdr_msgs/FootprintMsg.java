package stdr_msgs;

public interface FootprintMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/FootprintMsg";
  static final java.lang.String _DEFINITION = "geometry_msgs/Point[] points\nfloat32 radius # for circular footprints\n";
  java.util.List<geometry_msgs.Point> getPoints();
  void setPoints(java.util.List<geometry_msgs.Point> value);
  float getRadius();
  void setRadius(float value);
}
