package world_canvas_msgs;

public interface SaveMapRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/SaveMapRequest";
  static final java.lang.String _DEFINITION = "# Service used to name the most recent saved map.\n\nstring map_name\n";
  java.lang.String getMapName();
  void setMapName(java.lang.String value);
}
