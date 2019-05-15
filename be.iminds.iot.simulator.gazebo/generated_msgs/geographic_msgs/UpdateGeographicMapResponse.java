package geographic_msgs;

public interface UpdateGeographicMapResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/UpdateGeographicMapResponse";
  static final java.lang.String _DEFINITION = "\nbool   success        # true if the call succeeded\nstring status         # more details";
  boolean getSuccess();
  void setSuccess(boolean value);
  java.lang.String getStatus();
  void setStatus(java.lang.String value);
}
