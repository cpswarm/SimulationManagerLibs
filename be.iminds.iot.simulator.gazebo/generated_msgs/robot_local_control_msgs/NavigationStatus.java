package robot_local_control_msgs;

public interface NavigationStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/NavigationStatus";
  static final java.lang.String _DEFINITION = "# type of navigation package/algorithm currently used\nstring NAVIGATION_TYPE_NONE=none\n# move_base\nstring NAVIGATION_TYPE_1=1\n# purepursuit\nstring NAVIGATION_TYPE_2=2\n# Dock\nstring NAVIGATION_TYPE_3=3 \n\n# state of the navigation node running\nstring NAVIGATION_STATE_INIT=init\nstring NAVIGATION_STATE_STANDBY=standby\nstring NAVIGATION_STATE_READY=ready\nstring NAVIGATION_STATE_EMERGENCY=emergency\nstring NAVIGATION_STATE_FAILURE=failure\n\n# Navigation algorithm being used\nstring type\n\n# INIT, READY, EMERGENCY, FAILURE\nstring state\n";
  static final java.lang.String NAVIGATION_TYPE_NONE = "none";
  static final java.lang.String NAVIGATION_TYPE_1 = "1";
  static final java.lang.String NAVIGATION_TYPE_2 = "2";
  static final java.lang.String NAVIGATION_TYPE_3 = "3";
  static final java.lang.String NAVIGATION_STATE_INIT = "init";
  static final java.lang.String NAVIGATION_STATE_STANDBY = "standby";
  static final java.lang.String NAVIGATION_STATE_READY = "ready";
  static final java.lang.String NAVIGATION_STATE_EMERGENCY = "emergency";
  static final java.lang.String NAVIGATION_STATE_FAILURE = "failure";
  java.lang.String getType();
  void setType(java.lang.String value);
  java.lang.String getState();
  void setState(java.lang.String value);
}
