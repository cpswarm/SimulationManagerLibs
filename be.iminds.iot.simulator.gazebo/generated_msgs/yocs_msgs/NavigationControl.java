package yocs_msgs;

public interface NavigationControl extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/NavigationControl";
  static final java.lang.String _DEFINITION = "# control the way point/trajectory navigation\nint8 control\n\nint8 STOP  = 0\nint8 START = 1\nint8 PAUSE = 2\n\n# name of the way point(s) / trajectory to be execute\n# leave empty, when stopping or pausing\nstring goal_name";
  static final byte STOP = 0;
  static final byte START = 1;
  static final byte PAUSE = 2;
  byte getControl();
  void setControl(byte value);
  java.lang.String getGoalName();
  void setGoalName(java.lang.String value);
}
