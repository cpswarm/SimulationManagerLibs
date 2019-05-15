package robot_local_control_msgs;

public interface FindMagneticGuide extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/FindMagneticGuide";
  static final java.lang.String _DEFINITION = "#maximum distance to search the guide\nstring turn_direction\nfloat32 in_distance\n";
  java.lang.String getTurnDirection();
  void setTurnDirection(java.lang.String value);
  float getInDistance();
  void setInDistance(float value);
}
