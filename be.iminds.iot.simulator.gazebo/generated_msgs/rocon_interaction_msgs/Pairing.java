package rocon_interaction_msgs;

public interface Pairing extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/Pairing";
  static final java.lang.String _DEFINITION = "###############################################################\n# Pairing rapp specification\n###############################################################\n\n# Unique name that represents this pairing. Note that you can\n# have multiple configurations of a single rapp, so the rapp\n# name alone is not enough to uniquely identify the pairing\nstring name\n\n# ros resource name of the rapp, e.g. rocon_apps/talker\nstring rapp\n\n###############################################################\n# Customising the rapp launch instance\n###############################################################\n\n# Can load the default rapp description, but sometimes useful to\n# override it to provide more human friendly information.\nstring description\n\n# Again, can load the default rapp icon, but may want to override it.\nrocon_std_msgs/Icon icon\n\nrocon_std_msgs/Remapping[] remappings\n\n# Key value pairs representing rapp parameters\nrocon_std_msgs/KeyValue[] parameters\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getRapp();
  void setRapp(java.lang.String value);
  java.lang.String getDescription();
  void setDescription(java.lang.String value);
  rocon_std_msgs.Icon getIcon();
  void setIcon(rocon_std_msgs.Icon value);
  java.util.List<rocon_std_msgs.Remapping> getRemappings();
  void setRemappings(java.util.List<rocon_std_msgs.Remapping> value);
  java.util.List<rocon_std_msgs.KeyValue> getParameters();
  void setParameters(java.util.List<rocon_std_msgs.KeyValue> value);
}
