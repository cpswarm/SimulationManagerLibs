package yocs_msgs;

public interface NavigationControlStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/NavigationControlStatus";
  static final java.lang.String _DEFINITION = "# Control the way point/trajectory navigation\nint8 status\n\nint8 ERROR     = -1\nint8 IDLING    = 0\nint8 RUNNING   = 1\nint8 PAUSED    = 2\nint8 COMPLETED = 3\nint8 CANCELLED = 4\n\n# Human-readable status description\nstring status_desc";
  static final byte ERROR = -1;
  static final byte IDLING = 0;
  static final byte RUNNING = 1;
  static final byte PAUSED = 2;
  static final byte COMPLETED = 3;
  static final byte CANCELLED = 4;
  byte getStatus();
  void setStatus(byte value);
  java.lang.String getStatusDesc();
  void setStatusDesc(java.lang.String value);
}
