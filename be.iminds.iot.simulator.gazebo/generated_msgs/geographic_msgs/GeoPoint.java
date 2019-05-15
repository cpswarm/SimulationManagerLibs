package geographic_msgs;

public interface GeoPoint extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GeoPoint";
  static final java.lang.String _DEFINITION = "# Geographic point, using the WGS 84 reference ellipsoid.\n\n# Latitude [degrees]. Positive is north of equator; negative is south\n# (-90 <= latitude <= +90).\nfloat64 latitude\n\n# Longitude [degrees]. Positive is east of prime meridian; negative is\n# west (-180 <= longitude <= +180). At the poles, latitude is -90 or\n# +90, and longitude is irrelevant, but must be in range.\nfloat64 longitude\n\n# Altitude [m]. Positive is above the WGS 84 ellipsoid (NaN if unspecified).\nfloat64 altitude\n";
  double getLatitude();
  void setLatitude(double value);
  double getLongitude();
  void setLongitude(double value);
  double getAltitude();
  void setAltitude(double value);
}
