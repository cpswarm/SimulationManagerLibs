package world_canvas_msgs;

public interface GetAnnotationsDataResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/GetAnnotationsDataResponse";
  static final java.lang.String _DEFINITION = "# What went wrong, if anything\nbool result\nstring message\n\nAnnotationData[] data ";
  boolean getResult();
  void setResult(boolean value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
  java.util.List<world_canvas_msgs.AnnotationData> getData();
  void setData(java.util.List<world_canvas_msgs.AnnotationData> value);
}
