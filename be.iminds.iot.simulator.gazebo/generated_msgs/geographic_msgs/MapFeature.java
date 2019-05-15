package geographic_msgs;

public interface MapFeature extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/MapFeature";
  static final java.lang.String _DEFINITION = "# Geographic map feature.\n#\n# A list of WayPoint IDs for features like streets, highways, hiking\n# trails, the outlines of buildings and parking lots in sequential\n# order.\n#\n# Feature lists may also contain other feature lists as members.\n\nuuid_msgs/UniqueID   id         # Unique feature identifier\nuuid_msgs/UniqueID[] components # Sequence of feature components\nKeyValue[] props                # Key/value properties for this feature\n";
  uuid_msgs.UniqueID getId();
  void setId(uuid_msgs.UniqueID value);
  java.util.List<uuid_msgs.UniqueID> getComponents();
  void setComponents(java.util.List<uuid_msgs.UniqueID> value);
  java.util.List<geographic_msgs.KeyValue> getProps();
  void setProps(java.util.List<geographic_msgs.KeyValue> value);
}
