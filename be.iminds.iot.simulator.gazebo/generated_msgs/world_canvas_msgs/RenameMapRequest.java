package world_canvas_msgs;

public interface RenameMapRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/RenameMapRequest";
  static final java.lang.String _DEFINITION = "# Service used to rename a given map.\n\nstring map_id\nstring new_name\n";
  java.lang.String getMapId();
  void setMapId(java.lang.String value);
  java.lang.String getNewName();
  void setNewName(java.lang.String value);
}
