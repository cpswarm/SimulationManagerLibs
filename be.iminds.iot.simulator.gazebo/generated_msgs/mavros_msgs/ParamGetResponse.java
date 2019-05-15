package mavros_msgs;

public interface ParamGetResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/ParamGetResponse";
  static final java.lang.String _DEFINITION = "bool success\nParamValue value";
  boolean getSuccess();
  void setSuccess(boolean value);
  mavros_msgs.ParamValue getValue();
  void setValue(mavros_msgs.ParamValue value);
}
