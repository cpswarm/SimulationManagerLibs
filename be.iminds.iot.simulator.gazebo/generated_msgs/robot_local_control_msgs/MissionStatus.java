package robot_local_control_msgs;

public interface MissionStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/MissionStatus";
  static final java.lang.String _DEFINITION = "# MISSION STATES\n# States inside a mission\nstring MISSION_STATE_UNKNOWN=unknown\nstring MISSION_STATE_RUNNING=running\nstring MISSION_STATE_PAUSED=paused\nstring MISSION_STATE_FINISHED=finished\nstring MISSION_STATE_CANCELLED=cancelled\nstring MISSION_STATE_ERROR=error\nstring MISSION_STATE_QUEUED=queued\n# running: mission is running\n# paused: mission is paused\n# finished: mission finished\n# canceled: mission has been canceled\n# error: an error occurred during the execution of the mission\n# queued: the mission is queued\n\n\n#\nint32 id\n\n# ID of the mision based on string format: GOTO [4,5,6]\nstring description\n\n# running, paused, finished,...\nstring state\n\n\n";
  static final java.lang.String MISSION_STATE_UNKNOWN = "unknown";
  static final java.lang.String MISSION_STATE_RUNNING = "running";
  static final java.lang.String MISSION_STATE_PAUSED = "paused";
  static final java.lang.String MISSION_STATE_FINISHED = "finished";
  static final java.lang.String MISSION_STATE_CANCELLED = "cancelled";
  static final java.lang.String MISSION_STATE_ERROR = "error";
  static final java.lang.String MISSION_STATE_QUEUED = "queued";
  int getId();
  void setId(int value);
  java.lang.String getDescription();
  void setDescription(java.lang.String value);
  java.lang.String getState();
  void setState(java.lang.String value);
}
