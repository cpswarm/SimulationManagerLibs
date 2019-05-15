package geographic_msgs;

public interface GetGeoPathResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GetGeoPathResponse";
  static final java.lang.String _DEFINITION = "\nbool success                          # true if the call succeeded\nstring status                         # more details\n\ngeographic_msgs/GeoPath plan          # path to follow";
  boolean getSuccess();
  void setSuccess(boolean value);
  java.lang.String getStatus();
  void setStatus(java.lang.String value);
  geographic_msgs.GeoPath getPlan();
  void setPlan(geographic_msgs.GeoPath value);
}
