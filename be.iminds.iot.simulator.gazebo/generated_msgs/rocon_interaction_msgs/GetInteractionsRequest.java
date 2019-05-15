package rocon_interaction_msgs;

public interface GetInteractionsRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/GetInteractionsRequest";
  static final java.lang.String _DEFINITION = "# For remocons who need to retrieve a filtered list of interactions\n# appropriate to the role and platform they will run for/on.\n\n\n# Filter according to groups. Disabled if the list is empty.\nstring[] groups\n\n# Filter according to the rocon uri of the requesting device.\n# Disabled if empty string (i.e. assumes a \'rocon:/\' filter).\nstring uri\n\n# Check if the interactions satisty runtime pairing requirements.\n# Disabled if false.\nbool runtime_pairing_requirements\n";
  java.util.List<java.lang.String> getGroups();
  void setGroups(java.util.List<java.lang.String> value);
  java.lang.String getUri();
  void setUri(java.lang.String value);
  boolean getRuntimePairingRequirements();
  void setRuntimePairingRequirements(boolean value);
}
