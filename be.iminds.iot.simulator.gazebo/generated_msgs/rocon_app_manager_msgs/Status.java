package rocon_app_manager_msgs;

public interface Status extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_app_manager_msgs/Status";
  static final java.lang.String _DEFINITION = "# Namespace under which applications will run if connected\nstring application_namespace\n\n# Who is controlling the app manager (i.e. who invited it to send it\'s\n# control handles). If the empty string, it is not being controlled \n# and subsequently is available\nstring remote_controller\n\n# Rapp is running or not\nstring RAPP_STOPPED=stopped\nstring RAPP_RUNNING=running\nstring rapp_status\n\n# Current app details (if running), a default Rapp() (filled with empty strings and lists) otherwise\nRapp rapp\n\n# The runtime, possibly namespaced and remapped interfaces/parameters\nPublishedInterface[] published_interfaces\nrocon_std_msgs/KeyValue[] published_parameters\n";
  static final java.lang.String RAPP_STOPPED = "stopped";
  static final java.lang.String RAPP_RUNNING = "running";
  java.lang.String getApplicationNamespace();
  void setApplicationNamespace(java.lang.String value);
  java.lang.String getRemoteController();
  void setRemoteController(java.lang.String value);
  java.lang.String getRappStatus();
  void setRappStatus(java.lang.String value);
  rocon_app_manager_msgs.Rapp getRapp();
  void setRapp(rocon_app_manager_msgs.Rapp value);
  java.util.List<rocon_app_manager_msgs.PublishedInterface> getPublishedInterfaces();
  void setPublishedInterfaces(java.util.List<rocon_app_manager_msgs.PublishedInterface> value);
  java.util.List<rocon_std_msgs.KeyValue> getPublishedParameters();
  void setPublishedParameters(java.util.List<rocon_std_msgs.KeyValue> value);
}
