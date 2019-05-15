package stdr_msgs;

public interface MoveRobotRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/MoveRobotRequest";
  static final java.lang.String _DEFINITION = "geometry_msgs/Pose2D newPose\n";
  geometry_msgs.Pose2D getNewPose();
  void setNewPose(geometry_msgs.Pose2D value);
}
