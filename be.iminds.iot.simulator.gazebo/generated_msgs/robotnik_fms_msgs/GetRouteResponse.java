package robotnik_fms_msgs;

public interface GetRouteResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/GetRouteResponse";
  static final java.lang.String _DEFINITION = "# list of nodes\nrobotnik_fms_msgs/NodeInfo[] nodes\n\n# velocity between every node\nfloat64[] velocities\n# list of magnets\nint32[] magnets\n# position of the magnets\ngeometry_msgs/Pose2D[] magnet_positions\n\n# ret\nbool ret\n# msg\nstring msg";
  java.util.List<robotnik_fms_msgs.NodeInfo> getNodes();
  void setNodes(java.util.List<robotnik_fms_msgs.NodeInfo> value);
  double[] getVelocities();
  void setVelocities(double[] value);
  int[] getMagnets();
  void setMagnets(int[] value);
  java.util.List<geometry_msgs.Pose2D> getMagnetPositions();
  void setMagnetPositions(java.util.List<geometry_msgs.Pose2D> value);
  boolean getRet();
  void setRet(boolean value);
  java.lang.String getMsg();
  void setMsg(java.lang.String value);
}
