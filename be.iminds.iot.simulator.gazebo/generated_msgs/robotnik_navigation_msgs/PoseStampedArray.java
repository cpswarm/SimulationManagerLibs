package robotnik_navigation_msgs;

public interface PoseStampedArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_navigation_msgs/PoseStampedArray";
  static final java.lang.String _DEFINITION = "# An array of poses with a header for global reference.\n\nHeader header\n\ngeometry_msgs/PoseStamped[] poses\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<geometry_msgs.PoseStamped> getPoses();
  void setPoses(java.util.List<geometry_msgs.PoseStamped> value);
}
