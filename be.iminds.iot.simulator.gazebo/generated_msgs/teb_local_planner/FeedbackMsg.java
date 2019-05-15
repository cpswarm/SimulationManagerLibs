package teb_local_planner;

public interface FeedbackMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "teb_local_planner/FeedbackMsg";
  static final java.lang.String _DEFINITION = "# Message that contains intermediate results \n# and diagnostics of the (predictive) planner.\n\nstd_msgs/Header header\n\n# The planned trajectory (or if multiple plans exist, all of them)\nteb_local_planner/TrajectoryMsg[] trajectories\n\n# Index of the trajectory in \'trajectories\' that is selected currently\nuint16 selected_trajectory_idx\n\n# List of active obstacles\ncostmap_converter/ObstacleArrayMsg obstacles_msg\n\n\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<teb_local_planner.TrajectoryMsg> getTrajectories();
  void setTrajectories(java.util.List<teb_local_planner.TrajectoryMsg> value);
  short getSelectedTrajectoryIdx();
  void setSelectedTrajectoryIdx(short value);
  costmap_converter.ObstacleArrayMsg getObstaclesMsg();
  void setObstaclesMsg(costmap_converter.ObstacleArrayMsg value);
}
