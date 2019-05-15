package mavros_msgs;

public interface SetModeResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/SetModeResponse";
  static final java.lang.String _DEFINITION = "bool mode_sent\t\t# Mode known/parsed correctly and SET_MODE are sent";
  boolean getModeSent();
  void setModeSent(boolean value);
}
