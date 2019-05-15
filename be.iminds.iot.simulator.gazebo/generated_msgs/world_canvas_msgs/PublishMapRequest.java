package world_canvas_msgs;

public interface PublishMapRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/PublishMapRequest";
  static final java.lang.String _DEFINITION = "# Service used to publish a given map from the database to the /map topic.\n\nstring map_id\n";
  java.lang.String getMapId();
  void setMapId(java.lang.String value);
}
