package gateway_msgs;

public interface RemoteGatewayInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/RemoteGatewayInfo";
  static final java.lang.String _DEFINITION = "# optional list of gateway names to filter the returned list\n# supplying this list empty returns information for all the gateways\nstring[] gateways\n---\nRemoteGateway[] gateways\n";
}
