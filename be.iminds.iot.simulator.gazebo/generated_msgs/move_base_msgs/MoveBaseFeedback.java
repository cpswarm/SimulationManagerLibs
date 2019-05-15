package move_base_msgs;

public interface MoveBaseFeedback extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "move_base_msgs/MoveBaseFeedback";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\ngeometry_msgs/PoseStamped base_position\n\n";
  geometry_msgs.PoseStamped getBasePosition();
  void setBasePosition(geometry_msgs.PoseStamped value);
}
