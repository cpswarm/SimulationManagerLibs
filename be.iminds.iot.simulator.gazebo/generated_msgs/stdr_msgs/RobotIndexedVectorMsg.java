package stdr_msgs;

public interface RobotIndexedVectorMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/RobotIndexedVectorMsg";
  static final java.lang.String _DEFINITION = "stdr_msgs/RobotIndexedMsg[] robots\n";
  java.util.List<stdr_msgs.RobotIndexedMsg> getRobots();
  void setRobots(java.util.List<stdr_msgs.RobotIndexedMsg> value);
}
