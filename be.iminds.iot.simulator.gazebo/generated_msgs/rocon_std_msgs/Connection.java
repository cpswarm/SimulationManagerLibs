package rocon_std_msgs;

public interface Connection extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_std_msgs/Connection";
  static final java.lang.String _DEFINITION = "# A connection can be 1 of 5 types\nstring PUBLISHER = publisher\nstring SUBSCRIBER = subscriber\nstring SERVICE = service\nstring ACTION_CLIENT = action_client\nstring ACTION_SERVER = action_server\nstring INVALID = invalid\n\n# type of connection (from string constants above)\nstring type\n\n# this is the topic/service name or the action base name\nstring name \n\n# the name of the node establishing this connection\nstring node\n\n# topic, service or action type, e.g. std_msgs/String\nstring type_msg\n\n# topic, service or action extra type info ( uri for service )\nstring type_info\n\n# xmlrpc node uri for managing the connection\nstring xmlrpc_uri";
  static final java.lang.String PUBLISHER = "publisher";
  static final java.lang.String SUBSCRIBER = "subscriber";
  static final java.lang.String SERVICE = "service";
  static final java.lang.String ACTION_CLIENT = "action_client";
  static final java.lang.String ACTION_SERVER = "action_server";
  static final java.lang.String INVALID = "invalid";
  java.lang.String getType();
  void setType(java.lang.String value);
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getNode();
  void setNode(java.lang.String value);
  java.lang.String getTypeMsg();
  void setTypeMsg(java.lang.String value);
  java.lang.String getTypeInfo();
  void setTypeInfo(java.lang.String value);
  java.lang.String getXmlrpcUri();
  void setXmlrpcUri(java.lang.String value);
}
