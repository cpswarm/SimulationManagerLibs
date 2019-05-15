package world_canvas_msgs;

public interface SaveAnnotationsDataRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/SaveAnnotationsDataRequest";
  static final java.lang.String _DEFINITION = "# Utility service kept to make debug and testing easier:\n#   saves together annotations and its data assuming a 1-1 relationship.\n\nAnnotation[] annotations\nAnnotationData[] data \n";
  java.util.List<world_canvas_msgs.Annotation> getAnnotations();
  void setAnnotations(java.util.List<world_canvas_msgs.Annotation> value);
  java.util.List<world_canvas_msgs.AnnotationData> getData();
  void setData(java.util.List<world_canvas_msgs.AnnotationData> value);
}
