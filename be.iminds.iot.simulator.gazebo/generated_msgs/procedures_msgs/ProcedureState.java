package procedures_msgs;

public interface ProcedureState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "procedures_msgs/ProcedureState";
  static final java.lang.String _DEFINITION = "# STATE allowed values. Defined as STRING because it is easier to identify them in a raw message\nstring QUEUED=queued\nstring RUNNING=running\nstring PAUSED=paused\nstring FINISHED=finished\n\n# EVENT allowed values. Defined as STRING because it is easier to identify them in a raw message\n# events triggered from outside\nstring ADDED=added\nstring START=start\nstring STOP=stop\nstring CANCEL=cancel\nstring PAUSE=pause\nstring RESUME=resume\n# self triggered events\nstring FINISH=finish\nstring ABORT=abort\n\n# additionally, both state and event can be UNKNOW\nstring UNKNOWN=unknown\n\nProcedureHeader header\nstring current_state\nstring last_event\n";
  static final java.lang.String QUEUED = "queued";
  static final java.lang.String RUNNING = "running";
  static final java.lang.String PAUSED = "paused";
  static final java.lang.String FINISHED = "finished";
  static final java.lang.String ADDED = "added";
  static final java.lang.String START = "start";
  static final java.lang.String STOP = "stop";
  static final java.lang.String CANCEL = "cancel";
  static final java.lang.String PAUSE = "pause";
  static final java.lang.String RESUME = "resume";
  static final java.lang.String FINISH = "finish";
  static final java.lang.String ABORT = "abort";
  static final java.lang.String UNKNOWN = "unknown";
  procedures_msgs.ProcedureHeader getHeader();
  void setHeader(procedures_msgs.ProcedureHeader value);
  java.lang.String getCurrentState();
  void setCurrentState(java.lang.String value);
  java.lang.String getLastEvent();
  void setLastEvent(java.lang.String value);
}
