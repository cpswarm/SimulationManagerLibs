package robot_localization;

public interface SetPoseRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_localization/SetPoseRequest";
  static final java.lang.String _DEFINITION = "geometry_msgs/PoseWithCovarianceStamped pose\n";
  geometry_msgs.PoseWithCovarianceStamped getPose();
  void setPose(geometry_msgs.PoseWithCovarianceStamped value);
}
