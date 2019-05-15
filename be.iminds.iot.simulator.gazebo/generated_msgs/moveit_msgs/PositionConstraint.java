package moveit_msgs;

public interface PositionConstraint extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/PositionConstraint";
  static final java.lang.String _DEFINITION = "# This message contains the definition of a position constraint.\n\nHeader header\n\n# The robot link this constraint refers to\nstring link_name\n\n# The offset (in the link frame) for the target point on the link we are planning for\ngeometry_msgs/Vector3 target_point_offset\n\n# The volume this constraint refers to \nBoundingVolume constraint_region\n\n# A weighting factor for this constraint (denotes relative importance to other constraints. Closer to zero means less important)\nfloat64 weight\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.lang.String getLinkName();
  void setLinkName(java.lang.String value);
  geometry_msgs.Vector3 getTargetPointOffset();
  void setTargetPointOffset(geometry_msgs.Vector3 value);
  moveit_msgs.BoundingVolume getConstraintRegion();
  void setConstraintRegion(moveit_msgs.BoundingVolume value);
  double getWeight();
  void setWeight(double value);
}
