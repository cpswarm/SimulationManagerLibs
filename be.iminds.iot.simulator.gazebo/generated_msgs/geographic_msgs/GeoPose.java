package geographic_msgs;

public interface GeoPose extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GeoPose";
  static final java.lang.String _DEFINITION = "# Geographic pose, using the WGS 84 reference ellipsoid.\n#\n# Orientation uses the East-North-Up (ENU) frame of reference.\n# (But, what about singularities at the poles?)\n\nGeoPoint position\ngeometry_msgs/Quaternion orientation\n";
  geographic_msgs.GeoPoint getPosition();
  void setPosition(geographic_msgs.GeoPoint value);
  geometry_msgs.Quaternion getOrientation();
  void setOrientation(geometry_msgs.Quaternion value);
}
