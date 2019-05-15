package rocon_interaction_msgs;

public interface InteractiveClients extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/InteractiveClients";
  static final java.lang.String _DEFINITION = "# \n# Two lists are included here to distinguish between idle clients and those that\n# are currently running an app.\n#\nInteractiveClient[] idle_clients\nInteractiveClient[] running_clients\n";
  java.util.List<rocon_interaction_msgs.InteractiveClient> getIdleClients();
  void setIdleClients(java.util.List<rocon_interaction_msgs.InteractiveClient> value);
  java.util.List<rocon_interaction_msgs.InteractiveClient> getRunningClients();
  void setRunningClients(java.util.List<rocon_interaction_msgs.InteractiveClient> value);
}
