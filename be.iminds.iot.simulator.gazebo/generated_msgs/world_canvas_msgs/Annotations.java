package world_canvas_msgs;

public interface Annotations extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/Annotations";
  static final java.lang.String _DEFINITION = "# Semantic map:\n#  - geometric map id\n#  - a list of annotations\n\nstring map_id\nAnnotation[] annotations\n";
  java.lang.String getMapId();
  void setMapId(java.lang.String value);
  java.util.List<world_canvas_msgs.Annotation> getAnnotations();
  void setAnnotations(java.util.List<world_canvas_msgs.Annotation> value);
}
