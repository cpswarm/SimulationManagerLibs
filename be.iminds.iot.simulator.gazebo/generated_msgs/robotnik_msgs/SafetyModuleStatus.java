package robotnik_msgs;

public interface SafetyModuleStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/SafetyModuleStatus";
  static final java.lang.String _DEFINITION = "# robot safety mode\nstring SAFE=safe\nstring OVERRIDABLE=overridable\nstring EMERGENCY=emergency\n\nstring safety_mode\nbool charging\nbool emergency_stop   # if e-stop is pressed\nbool safety_stop      # if system is stopped due to safety system\nbool safety_overrided # if safety system is overrided\nbool lasers_on_standby # if lasers don\'t have power\nrobotnik_msgs/LaserMode lasers_mode\nrobotnik_msgs/LaserStatus[] lasers_status\n";
  static final java.lang.String SAFE = "safe";
  static final java.lang.String OVERRIDABLE = "overridable";
  static final java.lang.String EMERGENCY = "emergency";
  java.lang.String getSafetyMode();
  void setSafetyMode(java.lang.String value);
  boolean getCharging();
  void setCharging(boolean value);
  boolean getEmergencyStop();
  void setEmergencyStop(boolean value);
  boolean getSafetyStop();
  void setSafetyStop(boolean value);
  boolean getSafetyOverrided();
  void setSafetyOverrided(boolean value);
  boolean getLasersOnStandby();
  void setLasersOnStandby(boolean value);
  robotnik_msgs.LaserMode getLasersMode();
  void setLasersMode(robotnik_msgs.LaserMode value);
  java.util.List<robotnik_msgs.LaserStatus> getLasersStatus();
  void setLasersStatus(java.util.List<robotnik_msgs.LaserStatus> value);
}
