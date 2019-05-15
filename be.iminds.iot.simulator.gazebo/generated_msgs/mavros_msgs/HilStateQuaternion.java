package mavros_msgs;

public interface HilStateQuaternion extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/HilStateQuaternion";
  static final java.lang.String _DEFINITION = "# HilStateQuaternion.msg\n#\n# ROS representation of MAVLink HIL_STATE_QUATERNION\n# See mavlink message documentation here:\n# https://pixhawk.ethz.ch/mavlink/#HIL_STATE_QUATERNION\n\nstd_msgs/Header header\n\ngeometry_msgs/Quaternion orientation\ngeometry_msgs/Vector3 angular_velocity\ngeometry_msgs/Vector3 linear_acceleration\ngeometry_msgs/Vector3 linear_velocity\ngeographic_msgs/GeoPoint geo\nfloat32 ind_airspeed\nfloat32 true_airspeed\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geometry_msgs.Quaternion getOrientation();
  void setOrientation(geometry_msgs.Quaternion value);
  geometry_msgs.Vector3 getAngularVelocity();
  void setAngularVelocity(geometry_msgs.Vector3 value);
  geometry_msgs.Vector3 getLinearAcceleration();
  void setLinearAcceleration(geometry_msgs.Vector3 value);
  geometry_msgs.Vector3 getLinearVelocity();
  void setLinearVelocity(geometry_msgs.Vector3 value);
  geographic_msgs.GeoPoint getGeo();
  void setGeo(geographic_msgs.GeoPoint value);
  float getIndAirspeed();
  void setIndAirspeed(float value);
  float getTrueAirspeed();
  void setTrueAirspeed(float value);
}
