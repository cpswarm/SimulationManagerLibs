package world_canvas_msgs;

public interface MapListEntry extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/MapListEntry";
  static final java.lang.String _DEFINITION = "# One entry in a list of maps.\n\n# Naming a map is optional.\nstring name\n\n# Maps made by the make-a-map app are given a session ID, which is the\n# time when the map-making session was started, expressed as seconds\n# since the epoch and converted to a string.\nstring session_id\n\n# Creation time of this map, in seconds since the epoch.\nint64 date\n\n# Unique ID of this map.\nstring map_id\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getSessionId();
  void setSessionId(java.lang.String value);
  long getDate();
  void setDate(long value);
  java.lang.String getMapId();
  void setMapId(java.lang.String value);
}
