package amcl;

public interface ChangeMapRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "amcl/ChangeMapRequest";
  static final java.lang.String _DEFINITION = "string topic\n";
  java.lang.String getTopic();
  void setTopic(java.lang.String value);
}
