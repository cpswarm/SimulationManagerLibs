package moveit_msgs;

public interface OrientedBoundingBox extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/OrientedBoundingBox";
  static final java.lang.String _DEFINITION = "# the pose of the box\ngeometry_msgs/Pose pose\n\n# the extents of the box, assuming the center is at the origin\ngeometry_msgs/Point32 extents\n";
  geometry_msgs.Pose getPose();
  void setPose(geometry_msgs.Pose value);
  geometry_msgs.Point32 getExtents();
  void setExtents(geometry_msgs.Point32 value);
}
