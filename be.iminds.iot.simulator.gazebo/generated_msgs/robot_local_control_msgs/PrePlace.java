package robot_local_control_msgs;

public interface PrePlace extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/PrePlace";
  static final java.lang.String _DEFINITION = "float64 maximum_distance\nuint32 lane\nstring turn_direction\n";
  double getMaximumDistance();
  void setMaximumDistance(double value);
  int getLane();
  void setLane(int value);
  java.lang.String getTurnDirection();
  void setTurnDirection(java.lang.String value);
}
