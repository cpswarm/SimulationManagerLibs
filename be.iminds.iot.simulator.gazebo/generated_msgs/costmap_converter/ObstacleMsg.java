package costmap_converter;

public interface ObstacleMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "costmap_converter/ObstacleMsg";
  static final java.lang.String _DEFINITION = "# Special types:\n# Polygon with 1 vertex: Point obstacle (you might also specify a non-zero value for radius)\n# Polygon with 2 vertices: Line obstacle\n# Polygon with more than 2 vertices: First and last points are assumed to be connected\n\nstd_msgs/Header header\n\n# Obstacle footprint (polygon descriptions)\ngeometry_msgs/Polygon polygon\n\n# Specify the radius for circular/point obstacles\nfloat64 radius\n\n# Obstacle ID\n# Specify IDs in order to provide (temporal) relationships\n# between obstacles among multiple messages.\nint64 id\n\n# Individual orientation (centroid)\ngeometry_msgs/Quaternion orientation\n\n# Individual velocities (centroid)\ngeometry_msgs/TwistWithCovariance velocities\n\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Polygon getPolygon();
  void setPolygon(geometry_msgs.Polygon value);
  double getRadius();
  void setRadius(double value);
  long getId();
  void setId(long value);
  geometry_msgs.Quaternion getOrientation();
  void setOrientation(geometry_msgs.Quaternion value);
  geometry_msgs.TwistWithCovariance getVelocities();
  void setVelocities(geometry_msgs.TwistWithCovariance value);
}
