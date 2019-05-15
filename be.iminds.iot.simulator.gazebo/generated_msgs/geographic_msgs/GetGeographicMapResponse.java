package geographic_msgs;

public interface GetGeographicMapResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GetGeographicMapResponse";
  static final java.lang.String _DEFINITION = "\nbool success          # true if the call succeeded\nstring status         # more details\n\n# The requested map, its bounds may differ from the requested bounds.\nGeographicMap map";
  boolean getSuccess();
  void setSuccess(boolean value);
  java.lang.String getStatus();
  void setStatus(java.lang.String value);
  geographic_msgs.GeographicMap getMap();
  void setMap(geographic_msgs.GeographicMap value);
}
