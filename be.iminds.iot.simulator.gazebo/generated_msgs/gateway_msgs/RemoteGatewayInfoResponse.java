package gateway_msgs;

public interface RemoteGatewayInfoResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/RemoteGatewayInfoResponse";
  static final java.lang.String _DEFINITION = "RemoteGateway[] gateways";
  java.util.List<gateway_msgs.RemoteGateway> getGateways();
  void setGateways(java.util.List<gateway_msgs.RemoteGateway> value);
}
