package gateway_msgs;

public interface GatewayInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/GatewayInfo";
  static final java.lang.String _DEFINITION = "###### Gateway information ######\n\n# Gateway parameters\nstring name\nbool connected\nstring ip\n\n# Hub parameters\nstring[] hub_names\nstring[] hub_uris\n\nbool firewall\n\n###### Public Interface ######\n\nRule[] public_watchlist\nRule[] public_interface\n\n###### Flipped Interface ######\n\nRemoteRuleWithStatus[] flipped_connections\nRemoteRule[] flip_watchlist\nRemoteRule[] flipped_in_connections\n\n###### Pulled Interface ######\n\nRemoteRule[] pull_watchlist\nRemoteRule[] pulled_connections\n\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  boolean getConnected();
  void setConnected(boolean value);
  java.lang.String getIp();
  void setIp(java.lang.String value);
  java.util.List<java.lang.String> getHubNames();
  void setHubNames(java.util.List<java.lang.String> value);
  java.util.List<java.lang.String> getHubUris();
  void setHubUris(java.util.List<java.lang.String> value);
  boolean getFirewall();
  void setFirewall(boolean value);
  java.util.List<gateway_msgs.Rule> getPublicWatchlist();
  void setPublicWatchlist(java.util.List<gateway_msgs.Rule> value);
  java.util.List<gateway_msgs.Rule> getPublicInterface();
  void setPublicInterface(java.util.List<gateway_msgs.Rule> value);
  java.util.List<gateway_msgs.RemoteRuleWithStatus> getFlippedConnections();
  void setFlippedConnections(java.util.List<gateway_msgs.RemoteRuleWithStatus> value);
  java.util.List<gateway_msgs.RemoteRule> getFlipWatchlist();
  void setFlipWatchlist(java.util.List<gateway_msgs.RemoteRule> value);
  java.util.List<gateway_msgs.RemoteRule> getFlippedInConnections();
  void setFlippedInConnections(java.util.List<gateway_msgs.RemoteRule> value);
  java.util.List<gateway_msgs.RemoteRule> getPullWatchlist();
  void setPullWatchlist(java.util.List<gateway_msgs.RemoteRule> value);
  java.util.List<gateway_msgs.RemoteRule> getPulledConnections();
  void setPulledConnections(java.util.List<gateway_msgs.RemoteRule> value);
}
