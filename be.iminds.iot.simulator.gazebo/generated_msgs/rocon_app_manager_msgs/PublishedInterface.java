package rocon_app_manager_msgs;

public interface PublishedInterface extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_app_manager_msgs/PublishedInterface";
  static final java.lang.String _DEFINITION = "# The runtime, possibly namespaced and remapped public interface.\n\nPublicInterface interface\n\n# Final absolute namespaced/remapped name of the topic/service/action xxx\nstring name";
  rocon_app_manager_msgs.PublicInterface getInterface();
  void setInterface(rocon_app_manager_msgs.PublicInterface value);
  java.lang.String getName();
  void setName(java.lang.String value);
}
