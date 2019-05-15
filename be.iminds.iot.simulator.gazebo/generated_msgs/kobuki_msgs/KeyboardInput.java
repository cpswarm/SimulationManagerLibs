package kobuki_msgs;

public interface KeyboardInput extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/KeyboardInput";
  static final java.lang.String _DEFINITION = "# KEYBOARD INPUT\n# \n# Keycodes to be transferred for remote teleops.\n\nuint8  KeyCode_Right    = 67     # 0x43\nuint8  KeyCode_Left     = 68     # 0x44\nuint8  KeyCode_Up       = 65     # 0x41\nuint8  KeyCode_Down     = 66     # 0x42\nuint8  KeyCode_Space    = 32     # 0x20\nuint8  KeyCode_Enable   = 101    # 0x65, \'e\'\nuint8  KeyCode_Disable  = 100    # 0x64, \'d\'\n\nuint8 pressedKey";
  static final byte KeyCode_Right = 67;
  static final byte KeyCode_Left = 68;
  static final byte KeyCode_Up = 65;
  static final byte KeyCode_Down = 66;
  static final byte KeyCode_Space = 32;
  static final byte KeyCode_Enable = 101;
  static final byte KeyCode_Disable = 100;
  byte getPressedKey();
  void setPressedKey(byte value);
}
