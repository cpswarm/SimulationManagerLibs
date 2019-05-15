package yocs_msgs;

public interface Wall extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/Wall";
  static final java.lang.String _DEFINITION = "# Virtual wall obstacle;\n#  - Assumed to be a plan, so width is ignored by now\n#  - The yaw provides the orientation of x-axis\n#  - Assumed vertically aligned (roll and pitch must be 0)\n#  - Z provides the lower border of the wall (normally 0)\n\nstring  name\nfloat32 length\nfloat32 width\nfloat32 height\ngeometry_msgs/PoseWithCovarianceStamped pose\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  float getLength();
  void setLength(float value);
  float getWidth();
  void setWidth(float value);
  float getHeight();
  void setHeight(float value);
  geometry_msgs.PoseWithCovarianceStamped getPose();
  void setPose(geometry_msgs.PoseWithCovarianceStamped value);
}
