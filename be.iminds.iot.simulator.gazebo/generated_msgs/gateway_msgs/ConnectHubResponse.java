package gateway_msgs;

public interface ConnectHubResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/ConnectHubResponse";
  static final java.lang.String _DEFINITION = "# Return a verbose error string to help with debugging if success fails.\n# Strings defined in gateway_comms.msg.Result\nint8 result\nstring error_message";
  byte getResult();
  void setResult(byte value);
  java.lang.String getErrorMessage();
  void setErrorMessage(java.lang.String value);
}
