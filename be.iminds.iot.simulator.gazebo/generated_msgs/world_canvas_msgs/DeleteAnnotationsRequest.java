package world_canvas_msgs;

public interface DeleteAnnotationsRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/DeleteAnnotationsRequest";
  static final java.lang.String _DEFINITION = "# Request server to delete the given annotations\n\nAnnotation[] annotations\n\n";
  java.util.List<world_canvas_msgs.Annotation> getAnnotations();
  void setAnnotations(java.util.List<world_canvas_msgs.Annotation> value);
}
