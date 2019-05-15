package gateway_msgs;

public interface AdvertiseResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/AdvertiseResponse";
  static final java.lang.String _DEFINITION = "\n# Return a verbose error string to help with debugging if success fails.\n# Strings defined in gateway_comms.msg.Result\nint8 result\nstring error_message\n\nRule[] watchlist";
  byte getResult();
  void setResult(byte value);
  java.lang.String getErrorMessage();
  void setErrorMessage(java.lang.String value);
  java.util.List<gateway_msgs.Rule> getWatchlist();
  void setWatchlist(java.util.List<gateway_msgs.Rule> value);
}
