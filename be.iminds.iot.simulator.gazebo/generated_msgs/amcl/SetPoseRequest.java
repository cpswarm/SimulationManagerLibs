package amcl;

public interface SetPoseRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "amcl/SetPoseRequest";
  static final java.lang.String _DEFINITION = "geometry_msgs/PoseWithCovarianceStamped pose\n";
  geometry_msgs.PoseWithCovarianceStamped getPose();
  void setPose(geometry_msgs.PoseWithCovarianceStamped value);
}
