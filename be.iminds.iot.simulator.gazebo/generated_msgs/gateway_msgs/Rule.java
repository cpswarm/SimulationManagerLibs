package gateway_msgs;

public interface Rule extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/Rule";
  static final java.lang.String _DEFINITION = "# Standard gateway connection rule\n\n# type of connection (from gateway_msgs.msg.Connection)\nstring type\n\n# this is the topic/service name or the action base name (a regex is supported)\nstring name \n\n# (optional) an optional node name can be provided. if node name is not provided\n# then all nodes are matched (also supports regex)\nstring node\n";
  java.lang.String getType();
  void setType(java.lang.String value);
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getNode();
  void setNode(java.lang.String value);
}
