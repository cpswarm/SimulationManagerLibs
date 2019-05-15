package mavros_msgs;

public interface HomePosition extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/HomePosition";
  static final java.lang.String _DEFINITION = "# MAVLink message: HOME_POSITION\n# http://mavlink.org/messages/common#HOME_POSITION\n\nstd_msgs/Header header\n\ngeographic_msgs/GeoPoint geo # geodetic coordinates in WGS-84 datum\n\ngeometry_msgs/Point position\t# local position\ngeometry_msgs/Quaternion orientation\t# XXX: verify field name (q[4])\ngeometry_msgs/Vector3 approach\t# position of the end of approach vector\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geographic_msgs.GeoPoint getGeo();
  void setGeo(geographic_msgs.GeoPoint value);
  geometry_msgs.Point getPosition();
  void setPosition(geometry_msgs.Point value);
  geometry_msgs.Quaternion getOrientation();
  void setOrientation(geometry_msgs.Quaternion value);
  geometry_msgs.Vector3 getApproach();
  void setApproach(geometry_msgs.Vector3 value);
}
