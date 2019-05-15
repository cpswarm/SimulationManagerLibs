package frontier_exploration;

public interface GetNextFrontierResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "frontier_exploration/GetNextFrontierResponse";
  static final java.lang.String _DEFINITION = "geometry_msgs/PoseStamped next_frontier";
  geometry_msgs.PoseStamped getNextFrontier();
  void setNextFrontier(geometry_msgs.PoseStamped value);
}
