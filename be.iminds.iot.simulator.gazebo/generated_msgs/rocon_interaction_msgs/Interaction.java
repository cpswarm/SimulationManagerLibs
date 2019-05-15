package rocon_interaction_msgs;

public interface Interaction extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_interaction_msgs/Interaction";
  static final java.lang.String _DEFINITION = "###############################################################\n# Required Specifications\n###############################################################\n\n# User friendly version of the name. Useful to be customised\n# differently from the name for either 1) branding, or 2) because\n# some names are complicated visually (e.g. android names).\nstring name\n\n# This should be the string required to install and execute\n# the interaction from a remocon. \n# - android app : the intent action name (e.g. com.github.rosjava.android_apps.listener.Listener)\n# - web app : the url\n# - roslaunch : package resource name (e.g. gopher_meta/minimal.launch)\n# - rosrun : package resource name (e.g. gopher_meta/enable_motors)\n# - global : just the executable (e.g. rocon_master_info)\nstring command\n\n# A rocon uri string denoting the platforms this interaction\n# is compatible with\nstring compatibility\n\n###############################################################\n# Optional Specifications\n###############################################################\n\n# The group this solution has configured the interaction for.\nstring group\n\n# Should be a default for the interaction, but sometimes useful to\n# override it to provide more human friendly information.\nstring description\n\n# Again, should exist a default, but may want to override it.\nrocon_std_msgs/Icon icon\n\n# The namespace that this interaction will be associated\n# with. Interfaces from the interaction will be automatically pushed\n# into this namespace (for concerts it will be typically\n# used by the services to push interfaces into /services/_service_name_).\n# It is up to the user to make sure this is unique to avoid\n# potential conflicts.\nstring namespace\n\n# Any remappings that need to be applied\nrocon_std_msgs/Remapping[] remappings\n\n# Yaml string representing parameters for the interaction\nstring parameters\n\n# Maximum number of permitted connections (-1 = any)\nint32 UNLIMITED_INTERACTIONS = -1\nint32 max\n\n# If it should be paired with launch configurations via rapps\nbool bringup_pairing\nbool teardown_pairing\nstring[] required_pairings\n\n###############################################################\n# Parameters finalised by the interactions manager\n###############################################################\n\n# This is a crc32 hash code for the name-group-command\n# triple that uniquely identifies this interaction.\n# crc32 gets a few collisions, so we should be careful of that.\n# It is used by the nfc android auto-launching program so we can\n# compactify the request in the url sent by the nfc to the autolauncher.\nint32 hash\n\n";
  static final int UNLIMITED_INTERACTIONS = -1;
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getCommand();
  void setCommand(java.lang.String value);
  java.lang.String getCompatibility();
  void setCompatibility(java.lang.String value);
  java.lang.String getGroup();
  void setGroup(java.lang.String value);
  java.lang.String getDescription();
  void setDescription(java.lang.String value);
  rocon_std_msgs.Icon getIcon();
  void setIcon(rocon_std_msgs.Icon value);
  java.lang.String getNamespace();
  void setNamespace(java.lang.String value);
  java.util.List<rocon_std_msgs.Remapping> getRemappings();
  void setRemappings(java.util.List<rocon_std_msgs.Remapping> value);
  java.lang.String getParameters();
  void setParameters(java.lang.String value);
  int getMax();
  void setMax(int value);
  boolean getBringupPairing();
  void setBringupPairing(boolean value);
  boolean getTeardownPairing();
  void setTeardownPairing(boolean value);
  java.util.List<java.lang.String> getRequiredPairings();
  void setRequiredPairings(java.util.List<java.lang.String> value);
  int getHash();
  void setHash(int value);
}
