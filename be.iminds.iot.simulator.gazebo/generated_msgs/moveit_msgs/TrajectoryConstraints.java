package moveit_msgs;

public interface TrajectoryConstraints extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/TrajectoryConstraints";
  static final java.lang.String _DEFINITION = "# The array of constraints to consider along the trajectory\nConstraints[] constraints\n";
  java.util.List<moveit_msgs.Constraints> getConstraints();
  void setConstraints(java.util.List<moveit_msgs.Constraints> value);
}
