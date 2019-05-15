package gateway_msgs;

public interface RemoteRuleWithStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/RemoteRuleWithStatus";
  static final java.lang.String _DEFINITION = "# The remote rule whose status is being defined here\nRemoteRule remote_rule\n\n# Whether the flip is still pending, was accepted \nstring UNKNOWN=unknown\nstring PENDING=pending\nstring ACCEPTED=accepted\nstring BLOCKED=blocked\nstring RESEND=resend\nstring status\n";
  static final java.lang.String UNKNOWN = "unknown";
  static final java.lang.String PENDING = "pending";
  static final java.lang.String ACCEPTED = "accepted";
  static final java.lang.String BLOCKED = "blocked";
  static final java.lang.String RESEND = "resend";
  gateway_msgs.RemoteRule getRemoteRule();
  void setRemoteRule(gateway_msgs.RemoteRule value);
  java.lang.String getStatus();
  void setStatus(java.lang.String value);
}
