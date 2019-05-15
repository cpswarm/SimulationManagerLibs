package world_canvas_msgs;

public interface PubAnnotationsDataRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/PubAnnotationsDataRequest";
  static final java.lang.String _DEFINITION = "# Request server to publish annotations\' data for a list of annotation identifiers\n# If pub_as_list is true, annotations will be packed in a list before publishing,\n# so topic_type must be an array of the requested annotations. However, if is false,\n# topic_type is just ignored and the published topic type is obtained from one of\n# the annotations in the list\n# NOTE: in both cases, all annotations must be of the same type\n\nuuid_msgs/UniqueID[] annotation_ids\nstring topic_name\nstring topic_type\nbool pub_as_list\n\n";
  java.util.List<uuid_msgs.UniqueID> getAnnotationIds();
  void setAnnotationIds(java.util.List<uuid_msgs.UniqueID> value);
  java.lang.String getTopicName();
  void setTopicName(java.lang.String value);
  java.lang.String getTopicType();
  void setTopicType(java.lang.String value);
  boolean getPubAsList();
  void setPubAsList(boolean value);
}
