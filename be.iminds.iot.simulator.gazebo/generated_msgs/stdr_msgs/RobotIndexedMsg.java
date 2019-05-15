package stdr_msgs;

public interface RobotIndexedMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/RobotIndexedMsg";
  static final java.lang.String _DEFINITION = "string name\nstdr_msgs/RobotMsg robot\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  stdr_msgs.RobotMsg getRobot();
  void setRobot(stdr_msgs.RobotMsg value);
}
