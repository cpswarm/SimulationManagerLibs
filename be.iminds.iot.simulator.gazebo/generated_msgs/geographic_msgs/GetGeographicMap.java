package geographic_msgs;

public interface GetGeographicMap extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GetGeographicMap";
  static final java.lang.String _DEFINITION = "# This service requests a region of a geographic map.\n\nstring url            # where to read map data\n\n# Bounding box for the desired map.  If all zeros, provide all data\n# available from the specified URL.\nBoundingBox bounds\n\n---\n\nbool success          # true if the call succeeded\nstring status         # more details\n\n# The requested map, its bounds may differ from the requested bounds.\nGeographicMap map\n";
}
