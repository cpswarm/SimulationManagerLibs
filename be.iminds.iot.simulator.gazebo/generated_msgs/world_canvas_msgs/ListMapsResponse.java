package world_canvas_msgs;

public interface ListMapsResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/ListMapsResponse";
  static final java.lang.String _DEFINITION = "MapListEntry[] map_list";
  java.util.List<world_canvas_msgs.MapListEntry> getMapList();
  void setMapList(java.util.List<world_canvas_msgs.MapListEntry> value);
}
