package costmap_converter;

public interface ObstacleArrayMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "costmap_converter/ObstacleArrayMsg";
  static final java.lang.String _DEFINITION = "# Message that contains a list of polygon shaped obstacles.\n# Special types:\n# Polygon with 1 vertex: Point obstacle\n# Polygon with 2 vertices: Line obstacle\n# Polygon with more than 2 vertices: First and last points are assumed to be connected\n\nstd_msgs/Header header\n\ncostmap_converter/ObstacleMsg[] obstacles\n\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<costmap_converter.ObstacleMsg> getObstacles();
  void setObstacles(java.util.List<costmap_converter.ObstacleMsg> value);
}
