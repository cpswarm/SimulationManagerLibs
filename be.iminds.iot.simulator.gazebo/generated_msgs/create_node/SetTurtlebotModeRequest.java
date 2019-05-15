package create_node;

public interface SetTurtlebotModeRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "create_node/SetTurtlebotModeRequest";
  static final java.lang.String _DEFINITION = "uint8 mode #This sets the operating mode to one of the OI_MODE states from the TurtlebotSensorState.msg \n";
  byte getMode();
  void setMode(byte value);
}
