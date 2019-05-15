package robotnik_msgs;

public interface GetBoolResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/GetBoolResponse";
  static final java.lang.String _DEFINITION = "bool data\nbool success   # indicate successful run of triggered service\nstring message # informational, e.g. for error messages";
  boolean getData();
  void setData(boolean value);
  boolean getSuccess();
  void setSuccess(boolean value);
  java.lang.String getMessage();
  void setMessage(java.lang.String value);
}
