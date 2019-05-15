package world_canvas_msgs;

public interface GetAnnotationsRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "world_canvas_msgs/GetAnnotationsRequest";
  static final java.lang.String _DEFINITION = "# Various combinations of these filter criteria trigger various results\n# The only one mandatory is world_name; empty arrays are ignored\nstring world\nuuid_msgs/UniqueID[] ids  # Retrieved annotation uuid is within this list\nstring[] names            # Retrieved annotation name is within this list\nstring[] types            # Retrieved annotation type is within this list\nstring[] keywords         # Retrieved annotation has at least one of these keywords\nuuid_msgs/UniqueID[] relationships # Retrieve annotations related to those on this list\n\n";
  java.lang.String getWorld();
  void setWorld(java.lang.String value);
  java.util.List<uuid_msgs.UniqueID> getIds();
  void setIds(java.util.List<uuid_msgs.UniqueID> value);
  java.util.List<java.lang.String> getNames();
  void setNames(java.util.List<java.lang.String> value);
  java.util.List<java.lang.String> getTypes();
  void setTypes(java.util.List<java.lang.String> value);
  java.util.List<java.lang.String> getKeywords();
  void setKeywords(java.util.List<java.lang.String> value);
  java.util.List<uuid_msgs.UniqueID> getRelationships();
  void setRelationships(java.util.List<uuid_msgs.UniqueID> value);
}
