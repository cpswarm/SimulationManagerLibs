package moveit_msgs;

public interface CostSource extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/CostSource";
  static final java.lang.String _DEFINITION = "# The density of the cost source\nfloat64 cost_density\n\n# The volume of the cost source is represented as an\n# axis-aligned bounding box (AABB)\n# The AABB is specified by two of its opposite corners\n\ngeometry_msgs/Vector3 aabb_min\n\ngeometry_msgs/Vector3 aabb_max\n";
  double getCostDensity();
  void setCostDensity(double value);
  geometry_msgs.Vector3 getAabbMin();
  void setAabbMin(geometry_msgs.Vector3 value);
  geometry_msgs.Vector3 getAabbMax();
  void setAabbMax(geometry_msgs.Vector3 value);
}
