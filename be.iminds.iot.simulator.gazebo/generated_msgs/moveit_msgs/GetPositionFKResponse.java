package moveit_msgs;

public interface GetPositionFKResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetPositionFKResponse";
  static final java.lang.String _DEFINITION = "# The resultant vector of PoseStamped messages that contains the (stamped) poses of the requested links\ngeometry_msgs/PoseStamped[] pose_stamped\n\n# The list of link names corresponding to the poses\nstring[] fk_link_names\n\nMoveItErrorCodes error_code";
  java.util.List<geometry_msgs.PoseStamped> getPoseStamped();
  void setPoseStamped(java.util.List<geometry_msgs.PoseStamped> value);
  java.util.List<java.lang.String> getFkLinkNames();
  void setFkLinkNames(java.util.List<java.lang.String> value);
  moveit_msgs.MoveItErrorCodes getErrorCode();
  void setErrorCode(moveit_msgs.MoveItErrorCodes value);
}
