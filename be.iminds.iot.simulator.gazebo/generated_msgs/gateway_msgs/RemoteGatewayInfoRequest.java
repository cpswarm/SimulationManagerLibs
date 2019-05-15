package gateway_msgs;

public interface RemoteGatewayInfoRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/RemoteGatewayInfoRequest";
  static final java.lang.String _DEFINITION = "# optional list of gateway names to filter the returned list\n# supplying this list empty returns information for all the gateways\nstring[] gateways\n";
  java.util.List<java.lang.String> getGateways();
  void setGateways(java.util.List<java.lang.String> value);
}
