package rocon_std_msgs;

public interface MasterInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_std_msgs/MasterInfo";
  static final java.lang.String _DEFINITION = "# Publish basic information about this master.\n\nstring name\nstring rocon_uri\nstring description\nrocon_std_msgs/Icon icon\nstring version";
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getRoconUri();
  void setRoconUri(java.lang.String value);
  java.lang.String getDescription();
  void setDescription(java.lang.String value);
  rocon_std_msgs.Icon getIcon();
  void setIcon(rocon_std_msgs.Icon value);
  java.lang.String getVersion();
  void setVersion(java.lang.String value);
}
