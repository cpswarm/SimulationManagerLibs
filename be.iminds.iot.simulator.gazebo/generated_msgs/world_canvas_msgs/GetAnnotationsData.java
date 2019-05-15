package world_canvas_msgs;

public interface GetAnnotationsData extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/GetAnnotationsData";
  static final java.lang.String _DEFINITION = "# Request annotations\' data for a list of annotation identifiers\n\nuuid_msgs/UniqueID[] annotation_ids\n\n---\n# What went wrong, if anything\nbool result\nstring message\n\nAnnotationData[] data ";
}
