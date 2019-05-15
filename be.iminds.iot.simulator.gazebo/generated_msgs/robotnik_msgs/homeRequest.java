package robotnik_msgs;

public interface homeRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/homeRequest";
  static final java.lang.String _DEFINITION = "# Do home request\nbool request\n";
  boolean getRequest();
  void setRequest(boolean value);
}
