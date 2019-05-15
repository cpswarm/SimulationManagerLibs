package mavros_msgs;

public interface Trajectory extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/Trajectory";
  static final java.lang.String _DEFINITION = "# MAVLink message: TRAJECTORY\n# http://mavlink.org/messages/common#TRAJECTORY\n\nstd_msgs/Header header\n\nuint8 type # See enum MAV_TRAJECTORY_REPRESENTATION.\nuint8 MAV_TRAJECTORY_REPRESENTATION_WAYPOINTS = 0\nuint8 MAV_TRAJECTORY_REPRESENTATION_BEZIER = 1\n\nmavros_msgs/PositionTarget point_1\nmavros_msgs/PositionTarget point_2\nmavros_msgs/PositionTarget point_3\nmavros_msgs/PositionTarget point_4\nmavros_msgs/PositionTarget point_5\n\nuint8[5] point_valid # States if respective point is valid.\n\nfloat32[5] time_horizon # if type MAV_TRAJECTORY_REPRESENTATION_BEZIER, it represents the time horizon for each point, otherwise set to NaN\n";
  static final byte MAV_TRAJECTORY_REPRESENTATION_WAYPOINTS = 0;
  static final byte MAV_TRAJECTORY_REPRESENTATION_BEZIER = 1;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  byte getType();
  void setType(byte value);
  mavros_msgs.PositionTarget getPoint1();
  void setPoint1(mavros_msgs.PositionTarget value);
  mavros_msgs.PositionTarget getPoint2();
  void setPoint2(mavros_msgs.PositionTarget value);
  mavros_msgs.PositionTarget getPoint3();
  void setPoint3(mavros_msgs.PositionTarget value);
  mavros_msgs.PositionTarget getPoint4();
  void setPoint4(mavros_msgs.PositionTarget value);
  mavros_msgs.PositionTarget getPoint5();
  void setPoint5(mavros_msgs.PositionTarget value);
  org.jboss.netty.buffer.ChannelBuffer getPointValid();
  void setPointValid(org.jboss.netty.buffer.ChannelBuffer value);
  float[] getTimeHorizon();
  void setTimeHorizon(float[] value);
}
