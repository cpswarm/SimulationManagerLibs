package robot_local_control_msgs;

public interface Status extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/Status";
  static final java.lang.String _DEFINITION = "# GLOBAL ROBOT STATE\n# init: the robot is initializing\n# standby: the robot is ready to receive orders. Power saving behaviours can be applied\n# ready: the robot is ready to work or working\n# emergency: the robot cannot work/operate correctly temporary. It can imply a recovery procedure or an external action from the operator\n# failure: the robot is not working. It needs the operator intervention and probably restart/reboot the robot\nstring ROBOT_STATE_INIT=init\nstring ROBOT_STATE_STANDBY=standby\nstring ROBOT_STATE_READY=ready\nstring ROBOT_STATE_EMERGENCY=emergency\nstring ROBOT_STATE_FAILURE=failure\n\n\n# CONTROL STATES OF THE ROBOT\n# auto: the robot is moving autonomously\n# manual: the robot is being tele-operated by an operator\n# follow: the robot is following a person \nstring CONTROL_STATE_UNKNOWN=unknown\nstring CONTROL_STATE_AUTO=auto\nstring CONTROL_STATE_MANUAL=manual\nstring CONTROL_STATE_FOLLOW=follow\n\n\n# OPERATIONAL STATES\n# Defines what\'s doing the robot\n# idle: the robot is doing nothing\n# calibrating: the robot is calibrating\n# moving: the robot is moving\n# raising: the elevator is raising\n# lowering: the elevator is lowering\n# charging: the robot is charging the battery\nstring OPERATION_STATE_IDLE=idle\nstring OPERATION_STATE_CALIBRATION=calibrating\nstring OPERATION_STATE_MOVING=moving\nstring OPERATION_STATE_ELEVATION_RAISE=raising_elevator\nstring OPERATION_STATE_ELEVATION_LOWER=lowering_elevator\nstring OPERATION_STATE_BATTERY_CHARGE=charging\n\n\n###############################################################################################\n\n# Human readable ID\nstring robot_id\n\n# GLOBAL/Overall state of the component or robot\n# INIT, STANDBY, READY, EMERGENCY, FAILURE\nstring robot_state\n\n# ROBOT OPERATION MODE\n# AUTO, MANUAL, FOLLOW\nstring control_state\n\n# idle, calibrating, moving, raising_elevator,...\nstring operation_state\n\n# state of the mission/task\nMissions mission_status\n\n# queued missions?\n\n# Robot position (Define custom pose type)\n# RobotPose pose\n# type: gps, amcl, gmapping\nLocalizationStatus localization_status\n\n# Navigation Status\n# move_base, purepursuit, docking\nNavigationStatus navigation_status\n\n# Robot status: batt, lights, acoustic signal\n# odometry\nRobotStatus robot_status\n\n\n\n# clasificarlo por tipos (action, localization, sensors,controllers...)\n# string[] state_procedures\n\n\n";
  static final java.lang.String ROBOT_STATE_INIT = "init";
  static final java.lang.String ROBOT_STATE_STANDBY = "standby";
  static final java.lang.String ROBOT_STATE_READY = "ready";
  static final java.lang.String ROBOT_STATE_EMERGENCY = "emergency";
  static final java.lang.String ROBOT_STATE_FAILURE = "failure";
  static final java.lang.String CONTROL_STATE_UNKNOWN = "unknown";
  static final java.lang.String CONTROL_STATE_AUTO = "auto";
  static final java.lang.String CONTROL_STATE_MANUAL = "manual";
  static final java.lang.String CONTROL_STATE_FOLLOW = "follow";
  static final java.lang.String OPERATION_STATE_IDLE = "idle";
  static final java.lang.String OPERATION_STATE_CALIBRATION = "calibrating";
  static final java.lang.String OPERATION_STATE_MOVING = "moving";
  static final java.lang.String OPERATION_STATE_ELEVATION_RAISE = "raising_elevator";
  static final java.lang.String OPERATION_STATE_ELEVATION_LOWER = "lowering_elevator";
  static final java.lang.String OPERATION_STATE_BATTERY_CHARGE = "charging";
  java.lang.String getRobotId();
  void setRobotId(java.lang.String value);
  java.lang.String getRobotState();
  void setRobotState(java.lang.String value);
  java.lang.String getControlState();
  void setControlState(java.lang.String value);
  java.lang.String getOperationState();
  void setOperationState(java.lang.String value);
  robot_local_control_msgs.Missions getMissionStatus();
  void setMissionStatus(robot_local_control_msgs.Missions value);
  robot_local_control_msgs.LocalizationStatus getLocalizationStatus();
  void setLocalizationStatus(robot_local_control_msgs.LocalizationStatus value);
  robot_local_control_msgs.NavigationStatus getNavigationStatus();
  void setNavigationStatus(robot_local_control_msgs.NavigationStatus value);
  robot_local_control_msgs.RobotStatus getRobotStatus();
  void setRobotStatus(robot_local_control_msgs.RobotStatus value);
}
