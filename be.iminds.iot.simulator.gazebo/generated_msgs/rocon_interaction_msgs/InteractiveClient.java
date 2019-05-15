package rocon_interaction_msgs;

public interface InteractiveClient extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/InteractiveClient";
  static final java.lang.String _DEFINITION = "# \n# Describes an interactive concert client.\n#\n# Unique names - human consumable rocon name as well as globally unique name\n# provided by the remocon client.\n\nstring name\nuuid_msgs/UniqueID id\n\nrocon_std_msgs/MasterInfo platform_info\n\n# easy to read display names of interactions running on this remocon\nstring[] running_interactions\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  uuid_msgs.UniqueID getId();
  void setId(uuid_msgs.UniqueID value);
  rocon_std_msgs.MasterInfo getPlatformInfo();
  void setPlatformInfo(rocon_std_msgs.MasterInfo value);
  java.util.List<java.lang.String> getRunningInteractions();
  void setRunningInteractions(java.util.List<java.lang.String> value);
}
