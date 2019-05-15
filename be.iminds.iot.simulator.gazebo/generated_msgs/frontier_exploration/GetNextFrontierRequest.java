package frontier_exploration;

public interface GetNextFrontierRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "frontier_exploration/GetNextFrontierRequest";
  static final java.lang.String _DEFINITION = "geometry_msgs/PoseStamped start_pose\n";
  geometry_msgs.PoseStamped getStartPose();
  void setStartPose(geometry_msgs.PoseStamped value);
}
