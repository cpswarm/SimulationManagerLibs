package procedures_msgs;

public interface ProcedureHeader extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "procedures_msgs/ProcedureHeader";
  static final java.lang.String _DEFINITION = "# id: identifies the procedure in the robot context.\n# user should do not set this, but the proceduremanager\n# TODO: may be replaced with uuid_msgs/UniqueID.\nint32 id\n# priority: priority of the current procedure. used in case procedure preemption is allowed\nint32 priority\n# stamp: timestamp when procedure was started.\n# may be used by the procedure manager.\ntime stamp\n# name: human readable identificator.\n# set by the user, can be empty\n# not used by the procedure manager to identify the procedure\nstring name\n";
  int getId();
  void setId(int value);
  int getPriority();
  void setPriority(int value);
  org.ros.message.Time getStamp();
  void setStamp(org.ros.message.Time value);
  java.lang.String getName();
  void setName(java.lang.String value);
}
