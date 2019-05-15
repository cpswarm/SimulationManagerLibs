package rocon_app_manager_msgs;

public interface PublicInterface extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_app_manager_msgs/PublicInterface";
  static final java.lang.String _DEFINITION = "# Represents a public interface of a rapp\n\n# One of rocon_std_msgs.Connection type string constants (\'publisher, \'subscriber\', ...)\nstring connection_type\n\n# The data type, e.g. std_msgs/Strings\nstring data_type\n\n# Name of the topic/service/action xxx.\nstring name\n\n";
  java.lang.String getConnectionType();
  void setConnectionType(java.lang.String value);
  java.lang.String getDataType();
  void setDataType(java.lang.String value);
  java.lang.String getName();
  void setName(java.lang.String value);
}
