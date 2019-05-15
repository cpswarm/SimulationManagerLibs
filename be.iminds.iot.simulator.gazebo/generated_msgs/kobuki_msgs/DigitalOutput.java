package kobuki_msgs;

public interface DigitalOutput extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/DigitalOutput";
  static final java.lang.String _DEFINITION = "# Digital output - only four pins. \n\n# Array of values indices represent pins 0-3 respectively.\nbool[4] values\n\n# Set indices to true to set a pin, false to ignore.\nbool[4] mask\n";
  boolean[] getValues();
  void setValues(boolean[] value);
  boolean[] getMask();
  void setMask(boolean[] value);
}
