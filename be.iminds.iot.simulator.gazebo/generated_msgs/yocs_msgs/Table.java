package yocs_msgs;

public interface Table extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/Table";
  static final java.lang.String _DEFINITION = "# Semantic annotation for a table; by now a clone of column but with different semantics\n# In the future we must support also rectangular tables\n#  - Orientation is ignored\n#  - Z provides the lower border of the column (normally 0)\n\nstring  name\nfloat32 radius\nfloat32 height\ngeometry_msgs/PoseWithCovarianceStamped pose\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  float getRadius();
  void setRadius(float value);
  float getHeight();
  void setHeight(float value);
  geometry_msgs.PoseWithCovarianceStamped getPose();
  void setPose(geometry_msgs.PoseWithCovarianceStamped value);
}
