package rocon_app_manager_msgs;

public interface Rapp extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_app_manager_msgs/Rapp";
  static final java.lang.String _DEFINITION = "# This is the message that gets published in list_rapps. Do not think of it as the\n# \'rapp\' definition (since that is quite varied -> ancestor, virtual, child, implementation)\n# Rather it is the published list of rapps with the required information for the concert\n# and some introspection.\n\n# app name (ros resource name format, i.e. pkg/name, e.g. turtle_concert/teleop)\nstring name\n# user-friendly display name\nstring display_name\nstring description\n# a rocon uri string indicating platform compatibility\nstring compatibility\nstring status\n\n# a list of implementations\nstring[] implementations\n\n# A preferred rapp for virtual rapp\nstring preferred\n\n# icon for showing the app\nrocon_std_msgs/Icon icon\n\n# public interface and parameters\nrocon_std_msgs/KeyValue[] public_interface\nrocon_std_msgs/KeyValue[] public_parameters\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getDisplayName();
  void setDisplayName(java.lang.String value);
  java.lang.String getDescription();
  void setDescription(java.lang.String value);
  java.lang.String getCompatibility();
  void setCompatibility(java.lang.String value);
  java.lang.String getStatus();
  void setStatus(java.lang.String value);
  java.util.List<java.lang.String> getImplementations();
  void setImplementations(java.util.List<java.lang.String> value);
  java.lang.String getPreferred();
  void setPreferred(java.lang.String value);
  rocon_std_msgs.Icon getIcon();
  void setIcon(rocon_std_msgs.Icon value);
  java.util.List<rocon_std_msgs.KeyValue> getPublicInterface();
  void setPublicInterface(java.util.List<rocon_std_msgs.KeyValue> value);
  java.util.List<rocon_std_msgs.KeyValue> getPublicParameters();
  void setPublicParameters(java.util.List<rocon_std_msgs.KeyValue> value);
}
