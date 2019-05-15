package gateway_msgs;

public interface RemoteRule extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/RemoteRule";
  static final java.lang.String _DEFINITION = "# Definition for a flip. It represents either:\n#\n# 1) an existing flipped connection (from the local gateway)\n# 2) a rule that is put on a watchlist\n\n# The target recipient of the flip\nstring gateway\n\n# Connection has the following parameters that need setting\n# - name : fully qualified name of the connection (str)\n# - type : connection type (str)\n#  \n# Use one of the types defined in Connection string constants:\n#     (publisher, subscriber, service, action_client, action_server)\n#\n# - node : name of the node it originates from (str)(optional)\n#\n# Node name is necessary, for instance, if you have multiple subscribers\n# publishing to a single topic. Most of the time it is not necessary,\n# but in some cases it helps refine the rule. It helps refine the rule.\n#\nRule rule\n";
  java.lang.String getGateway();
  void setGateway(java.lang.String value);
  gateway_msgs.Rule getRule();
  void setRule(gateway_msgs.Rule value);
}
