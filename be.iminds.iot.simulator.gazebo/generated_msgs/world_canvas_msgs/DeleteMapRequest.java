package world_canvas_msgs;

public interface DeleteMapRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/DeleteMapRequest";
  static final java.lang.String _DEFINITION = "# Service used to delete a given map\n\nstring map_id\n";
  java.lang.String getMapId();
  void setMapId(java.lang.String value);
}
