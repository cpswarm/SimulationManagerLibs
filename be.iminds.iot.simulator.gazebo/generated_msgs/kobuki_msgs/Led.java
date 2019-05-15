package kobuki_msgs;

public interface Led extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/Led";
  static final java.lang.String _DEFINITION = "# Sends a command for controlling the a LED.\n# \n# Typically the first LED is always reserved to denote\n# the state - the remainder will be controllable. \n\nuint8 BLACK   = 0\nuint8 GREEN   = 1\nuint8 ORANGE  = 2\nuint8 RED     = 3\n\n# For kobuki there are only two controllable LED\'s.\nuint8 value\n";
  static final byte BLACK = 0;
  static final byte GREEN = 1;
  static final byte ORANGE = 2;
  static final byte RED = 3;
  byte getValue();
  void setValue(byte value);
}
