package multimaster_msgs_fkie;

public interface MasterState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs_fkie/MasterState";
  static final java.lang.String _DEFINITION = "string state\nmultimaster_msgs_fkie/ROSMaster master\n\nstring STATE_NEW=\'new\'\nstring STATE_REMOVED=\'removed\'\nstring STATE_CHANGED=\'changed\'\n";
  static final java.lang.String STATE_NEW = "\'new\'";
  static final java.lang.String STATE_REMOVED = "\'removed\'";
  static final java.lang.String STATE_CHANGED = "\'changed\'";
  java.lang.String getState();
  void setState(java.lang.String value);
  multimaster_msgs_fkie.ROSMaster getMaster();
  void setMaster(multimaster_msgs_fkie.ROSMaster value);
}
