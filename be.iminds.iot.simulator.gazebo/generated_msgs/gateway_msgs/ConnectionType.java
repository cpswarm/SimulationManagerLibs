package gateway_msgs;

public interface ConnectionType extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/ConnectionType";
  static final java.lang.String _DEFINITION = "# A connection can be 1 of 5 types\nstring PUBLISHER = publisher\nstring SUBSCRIBER = subscriber\nstring SERVICE = service\nstring ACTION_CLIENT = action_client\nstring ACTION_SERVER = action_server\nstring INVALID = invalid\n";
  static final java.lang.String PUBLISHER = "publisher";
  static final java.lang.String SUBSCRIBER = "subscriber";
  static final java.lang.String SERVICE = "service";
  static final java.lang.String ACTION_CLIENT = "action_client";
  static final java.lang.String ACTION_SERVER = "action_server";
  static final java.lang.String INVALID = "invalid";
}
