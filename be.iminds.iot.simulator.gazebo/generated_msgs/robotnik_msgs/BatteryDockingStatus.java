package robotnik_msgs;

public interface BatteryDockingStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/BatteryDockingStatus";
  static final java.lang.String _DEFINITION = "# Modes of operation:\n# no docking station contacts\nstring MODE_DISABLED=disabled\n# Unattended relay detection & activation with no inputs/outputs feedback. Done by the hw\nstring MODE_AUTO_HW=automatic_hw\n# Unattended relay detection & activation with inputs/outputs feedback. Done by the sw\nstring MODE_AUTO_SW=automatic_sw\n# Unattended relay detection & and manual activation of the charging relay\nstring MODE_MANUAL_SW=manual_sw\n\nstring operation_mode\n\t\nfloat32 battery_current\t\t# current flow in Amperes\nbool contact_relay_status\t# shows if there\'s contact with the charger\nbool charger_relay_status   # shows if the relay for the charge is active or not\n";
  static final java.lang.String MODE_DISABLED = "disabled";
  static final java.lang.String MODE_AUTO_HW = "automatic_hw";
  static final java.lang.String MODE_AUTO_SW = "automatic_sw";
  static final java.lang.String MODE_MANUAL_SW = "manual_sw";
  java.lang.String getOperationMode();
  void setOperationMode(java.lang.String value);
  float getBatteryCurrent();
  void setBatteryCurrent(float value);
  boolean getContactRelayStatus();
  void setContactRelayStatus(boolean value);
  boolean getChargerRelayStatus();
  void setChargerRelayStatus(boolean value);
}
