package robot_local_control_msgs;

public interface Missions extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/Missions";
  static final java.lang.String _DEFINITION = "# current mission\nMissionStatus current\n# list of old missions\nMissionStatus[] last\n";
  robot_local_control_msgs.MissionStatus getCurrent();
  void setCurrent(robot_local_control_msgs.MissionStatus value);
  java.util.List<robot_local_control_msgs.MissionStatus> getLast();
  void setLast(java.util.List<robot_local_control_msgs.MissionStatus> value);
}
