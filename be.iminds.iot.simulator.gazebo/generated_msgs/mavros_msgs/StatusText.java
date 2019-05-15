package mavros_msgs;

public interface StatusText extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/StatusText";
  static final java.lang.String _DEFINITION = "# STATUSTEXT message representation\n# https://mavlink.io/en/messages/common.html#STATUSTEXT\n\n# Severity levels\nuint8 EMERGENCY = 0\nuint8 ALERT = 1\nuint8 CRITICAL = 2\nuint8 ERROR = 3\nuint8 WARNING = 4\nuint8 NOTICE = 5\nuint8 INFO = 6\nuint8 DEBUG = 7\n\n# Fields\nstd_msgs/Header header\nuint8 severity\nstring text\n";
  static final byte EMERGENCY = 0;
  static final byte ALERT = 1;
  static final byte CRITICAL = 2;
  static final byte ERROR = 3;
  static final byte WARNING = 4;
  static final byte NOTICE = 5;
  static final byte INFO = 6;
  static final byte DEBUG = 7;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  byte getSeverity();
  void setSeverity(byte value);
  java.lang.String getText();
  void setText(java.lang.String value);
}
