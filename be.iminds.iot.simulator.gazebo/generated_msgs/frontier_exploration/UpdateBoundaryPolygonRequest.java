package frontier_exploration;

public interface UpdateBoundaryPolygonRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "frontier_exploration/UpdateBoundaryPolygonRequest";
  static final java.lang.String _DEFINITION = "geometry_msgs/PolygonStamped explore_boundary\n";
  geometry_msgs.PolygonStamped getExploreBoundary();
  void setExploreBoundary(geometry_msgs.PolygonStamped value);
}
