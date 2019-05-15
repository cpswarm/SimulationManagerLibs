package yocs_msgs;

public interface TrajectoryList extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/TrajectoryList";
  static final java.lang.String _DEFINITION = "# A list of trajectories\nTrajectory[] trajectories\n";
  java.util.List<yocs_msgs.Trajectory> getTrajectories();
  void setTrajectories(java.util.List<yocs_msgs.Trajectory> value);
}
