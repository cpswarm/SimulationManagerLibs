package mavros_msgs;

public interface ParamSetResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/ParamSetResponse";
  static final java.lang.String _DEFINITION = "bool success\nmavros_msgs/ParamValue value";
  boolean getSuccess();
  void setSuccess(boolean value);
  mavros_msgs.ParamValue getValue();
  void setValue(mavros_msgs.ParamValue value);
}
