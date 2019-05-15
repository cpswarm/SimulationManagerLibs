package world_canvas_msgs;

public interface ListWorldsResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/ListWorldsResponse";
  static final java.lang.String _DEFINITION = "string[] names";
  java.util.List<java.lang.String> getNames();
  void setNames(java.util.List<java.lang.String> value);
}
