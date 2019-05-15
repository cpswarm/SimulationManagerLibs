package robotnik_fms_msgs;

public interface GetRoute extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/GetRoute";
  static final java.lang.String _DEFINITION = "int32 from_node\nint32 to_node\n---\n# list of nodes\nrobotnik_fms_msgs/NodeInfo[] nodes\n\n# velocity between every node\nfloat64[] velocities\n# list of magnets\nint32[] magnets\n# position of the magnets\ngeometry_msgs/Pose2D[] magnet_positions\n\n# ret\nbool ret\n# msg\nstring msg\n\n\n\n\n";
}
