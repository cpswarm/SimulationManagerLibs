package moveit_msgs;

public interface ObjectColor extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/ObjectColor";
  static final java.lang.String _DEFINITION = "# The object id for which we specify color\nstring id\n\n# The value of the color\nstd_msgs/ColorRGBA color\n";
  java.lang.String getId();
  void setId(java.lang.String value);
  std_msgs.ColorRGBA getColor();
  void setColor(std_msgs.ColorRGBA value);
}
