package world_canvas_msgs;

public interface WorldCanvas extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/WorldCanvas";
  static final java.lang.String _DEFINITION = "# World canvas: a generic descriptor for a world, typically containing one or more geometric maps\n# plus semantic information in the form of annotations.\n#  - timestamp   : Creation/last update time\n#  - name        : World name; it must be unique\n#  - description : Informal description\n#  - geometry    : 2D, 3D (just informative by now)\n\ntime timestamp\nstring name\nstring description\nstring geometry";
  org.ros.message.Time getTimestamp();
  void setTimestamp(org.ros.message.Time value);
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getDescription();
  void setDescription(java.lang.String value);
  java.lang.String getGeometry();
  void setGeometry(java.lang.String value);
}
