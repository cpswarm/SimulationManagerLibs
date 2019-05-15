package yocs_msgs;

public interface WallList extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/WallList";
  static final java.lang.String _DEFINITION = "# Virtual wall obstacles\n\nWall[] obstacles";
  java.util.List<yocs_msgs.Wall> getObstacles();
  void setObstacles(java.util.List<yocs_msgs.Wall> value);
}
