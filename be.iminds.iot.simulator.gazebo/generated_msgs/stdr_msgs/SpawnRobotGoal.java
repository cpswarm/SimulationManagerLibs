package stdr_msgs;

public interface SpawnRobotGoal extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/SpawnRobotGoal";
  static final java.lang.String _DEFINITION = "# ====== DO NOT MODIFY! AUTOGENERATED FROM AN ACTION DEFINITION ======\n#goal definition\nstdr_msgs/RobotMsg description\n";
  stdr_msgs.RobotMsg getDescription();
  void setDescription(stdr_msgs.RobotMsg value);
}