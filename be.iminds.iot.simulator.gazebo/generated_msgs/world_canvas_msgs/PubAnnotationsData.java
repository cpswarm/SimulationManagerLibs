package world_canvas_msgs;

public interface PubAnnotationsData extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/PubAnnotationsData";
  static final java.lang.String _DEFINITION = "# Request server to publish annotations\' data for a list of annotation identifiers\n# If pub_as_list is true, annotations will be packed in a list before publishing,\n# so topic_type must be an array of the requested annotations. However, if is false,\n# topic_type is just ignored and the published topic type is obtained from one of\n# the annotations in the list\n# NOTE: in both cases, all annotations must be of the same type\n\nuuid_msgs/UniqueID[] annotation_ids\nstring topic_name\nstring topic_type\nbool pub_as_list\n\n---\n# What went wrong, if anything\nbool result\nstring message\n";
}
