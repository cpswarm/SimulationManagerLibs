package world_canvas_msgs;

public interface GetAnnotationsResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/GetAnnotationsResponse";
  static final java.lang.String _DEFINITION = "\n# What went wrong, if anything\nbool result\nstring message\n\nAnnotation[] annotations";
  boolean getResult();
  void setResult(boolean value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
  java.util.List<world_canvas_msgs.Annotation> getAnnotations();
  void setAnnotations(java.util.List<world_canvas_msgs.Annotation> value);
}
