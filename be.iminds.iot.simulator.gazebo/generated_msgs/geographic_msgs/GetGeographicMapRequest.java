package geographic_msgs;

public interface GetGeographicMapRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GetGeographicMapRequest";
  static final java.lang.String _DEFINITION = "# This service requests a region of a geographic map.\n\nstring url            # where to read map data\n\n# Bounding box for the desired map.  If all zeros, provide all data\n# available from the specified URL.\nBoundingBox bounds\n\n";
  java.lang.String getUrl();
  void setUrl(java.lang.String value);
  geographic_msgs.BoundingBox getBounds();
  void setBounds(geographic_msgs.BoundingBox value);
}
