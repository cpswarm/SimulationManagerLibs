package robot_local_control_msgs;

public interface MagneticPick extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/MagneticPick";
  static final java.lang.String _DEFINITION = "uint32 lane\nuint32 cart_position\nstring turn_direction\nbool allow_markers\nstring cart_id\n";
  int getLane();
  void setLane(int value);
  int getCartPosition();
  void setCartPosition(int value);
  java.lang.String getTurnDirection();
  void setTurnDirection(java.lang.String value);
  boolean getAllowMarkers();
  void setAllowMarkers(boolean value);
  java.lang.String getCartId();
  void setCartId(java.lang.String value);
}
