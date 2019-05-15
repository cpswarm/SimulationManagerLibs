package world_canvas_msgs;

public interface GetAnnotationsDataRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/GetAnnotationsDataRequest";
  static final java.lang.String _DEFINITION = "# Request annotations\' data for a list of annotation identifiers\n\nuuid_msgs/UniqueID[] annotation_ids\n\n";
  java.util.List<uuid_msgs.UniqueID> getAnnotationIds();
  void setAnnotationIds(java.util.List<uuid_msgs.UniqueID> value);
}
