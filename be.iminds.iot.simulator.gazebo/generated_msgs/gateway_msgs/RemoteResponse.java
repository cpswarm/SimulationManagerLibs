package gateway_msgs;

public interface RemoteResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/RemoteResponse";
  static final java.lang.String _DEFINITION = "\n# Return a verbose error string to help with debugging if success fails.\n# Strings defined in gateway_msgs.ErrorCodes\nint8 result\nstring error_message";
  byte getResult();
  void setResult(byte value);
  java.lang.String getErrorMessage();
  void setErrorMessage(java.lang.String value);
}
