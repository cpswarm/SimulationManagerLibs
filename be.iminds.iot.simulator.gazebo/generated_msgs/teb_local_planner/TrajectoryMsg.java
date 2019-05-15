package teb_local_planner;

public interface TrajectoryMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "teb_local_planner/TrajectoryMsg";
  static final java.lang.String _DEFINITION = "# Message that contains a trajectory for mobile robot navigation\n\nstd_msgs/Header header\nteb_local_planner/TrajectoryPointMsg[] trajectory\n\n\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<teb_local_planner.TrajectoryPointMsg> getTrajectory();
  void setTrajectory(java.util.List<teb_local_planner.TrajectoryPointMsg> value);
}
