package frontier_exploration;

public interface Frontier extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "frontier_exploration/Frontier";
  static final java.lang.String _DEFINITION = "uint32 size\nfloat64 min_distance\ngeometry_msgs/Point initial\ngeometry_msgs/Point centroid\ngeometry_msgs/Point middle\n";
  int getSize();
  void setSize(int value);
  double getMinDistance();
  void setMinDistance(double value);
  geometry_msgs.Point getInitial();
  void setInitial(geometry_msgs.Point value);
  geometry_msgs.Point getCentroid();
  void setCentroid(geometry_msgs.Point value);
  geometry_msgs.Point getMiddle();
  void setMiddle(geometry_msgs.Point value);
}
