package geographic_msgs;

public interface GetRoutePlanResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GetRoutePlanResponse";
  static final java.lang.String _DEFINITION = "\nbool            success         # true if the call succeeded\nstring          status          # more details\n\nRoutePath       plan            # path to follow";
  boolean getSuccess();
  void setSuccess(boolean value);
  java.lang.String getStatus();
  void setStatus(java.lang.String value);
  geographic_msgs.RoutePath getPlan();
  void setPlan(geographic_msgs.RoutePath value);
}
