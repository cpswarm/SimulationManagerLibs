package kobuki_msgs;

public interface DigitalInputEvent extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/DigitalInputEvent";
  static final java.lang.String _DEFINITION = "# This message is generated whenever the value of one or more digital input pins changes.\n\n# Array of values; indices represent pins 0-3 respectively.\nbool[4] values\n";
  boolean[] getValues();
  void setValues(boolean[] value);
}
