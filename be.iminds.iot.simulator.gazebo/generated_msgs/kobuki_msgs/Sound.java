package kobuki_msgs;

public interface Sound extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/Sound";
  static final java.lang.String _DEFINITION = "# Sends a command for playing sounds.\n# The available sound sequences:\n# 0 - turn on\n# 1 - turn off\n# 2 - recharge start\n# 3 - press button,\n# 4 - error sound\n# 5 - start cleaning\n# 6 - cleaning end\n\nuint8 ON            = 0\nuint8 OFF           = 1\nuint8 RECHARGE      = 2\nuint8 BUTTON        = 3\nuint8 ERROR         = 4\nuint8 CLEANINGSTART = 5\nuint8 CLEANINGEND   = 6\n\nuint8 value";
  static final byte ON = 0;
  static final byte OFF = 1;
  static final byte RECHARGE = 2;
  static final byte BUTTON = 3;
  static final byte ERROR = 4;
  static final byte CLEANINGSTART = 5;
  static final byte CLEANINGEND = 6;
  byte getValue();
  void setValue(byte value);
}
