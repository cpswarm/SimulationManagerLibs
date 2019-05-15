package yocs_msgs;

public interface Column extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/Column";
  static final java.lang.String _DEFINITION = "# Virtual column obstacle; a cylinder vertically aligned\n#  - Orientation is ignored\n#  - Z provides the lower border of the column (normally 0)\n\nstring  name\nfloat32 radius\nfloat32 height\ngeometry_msgs/PoseWithCovarianceStamped pose";
  java.lang.String getName();
  void setName(java.lang.String value);
  float getRadius();
  void setRadius(float value);
  float getHeight();
  void setHeight(float value);
  geometry_msgs.PoseWithCovarianceStamped getPose();
  void setPose(geometry_msgs.PoseWithCovarianceStamped value);
}
