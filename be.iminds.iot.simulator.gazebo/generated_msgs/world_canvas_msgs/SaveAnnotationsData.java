package world_canvas_msgs;

public interface SaveAnnotationsData extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/SaveAnnotationsData";
  static final java.lang.String _DEFINITION = "# Utility service kept to make debug and testing easier:\n#   saves together annotations and its data assuming a 1-1 relationship.\n\nAnnotation[] annotations\nAnnotationData[] data \n---\n# What went wrong, if anything\nbool result\nstring message\n";
}
