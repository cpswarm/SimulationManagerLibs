package robotnik_msgs;

public interface ElevatorStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/ElevatorStatus";
  static final java.lang.String _DEFINITION = "# state\nstring RAISING=raising\nstring LOWERING=lowering\nstring IDLE=idle\nstring ERROR_G_IO=error_getting_io\nstring ERROR_S_IO=error_setting_io\nstring ERROR_TIMEOUT=error_timeout_in_action\n# position\nstring UP=up\nstring DOWN=down\nstring UNKNOWN=unknown\n# IDLE, RAISING, LOWERING\nstring state\n# UP, DOWN, UNKNOWN\nstring position\n";
  static final java.lang.String RAISING = "raising";
  static final java.lang.String LOWERING = "lowering";
  static final java.lang.String IDLE = "idle";
  static final java.lang.String ERROR_G_IO = "error_getting_io";
  static final java.lang.String ERROR_S_IO = "error_setting_io";
  static final java.lang.String ERROR_TIMEOUT = "error_timeout_in_action";
  static final java.lang.String UP = "up";
  static final java.lang.String DOWN = "down";
  static final java.lang.String UNKNOWN = "unknown";
  java.lang.String getState();
  void setState(java.lang.String value);
  java.lang.String getPosition();
  void setPosition(java.lang.String value);
}
