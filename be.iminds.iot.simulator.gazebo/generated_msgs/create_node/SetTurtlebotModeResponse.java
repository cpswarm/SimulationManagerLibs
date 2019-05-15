package create_node;

public interface SetTurtlebotModeResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "create_node/SetTurtlebotModeResponse";
  static final java.lang.String _DEFINITION = "bool valid_mode # will return false if a unvalid mode was requested";
  boolean getValidMode();
  void setValidMode(boolean value);
}
