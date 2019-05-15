package mavros_msgs;

public interface ParamSetRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/ParamSetRequest";
  static final java.lang.String _DEFINITION = "# Request set parameter value\n\nstring param_id\nmavros_msgs/ParamValue value\n";
  java.lang.String getParamId();
  void setParamId(java.lang.String value);
  mavros_msgs.ParamValue getValue();
  void setValue(mavros_msgs.ParamValue value);
}
