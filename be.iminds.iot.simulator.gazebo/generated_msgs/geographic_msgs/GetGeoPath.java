package geographic_msgs;

public interface GetGeoPath extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GetGeoPath";
  static final java.lang.String _DEFINITION = "# Searches for given start and goal the nearest route segments\n# and determine the path through the RouteNetwork\n\ngeographic_msgs/GeoPoint start        # starting point\ngeographic_msgs/GeoPoint goal         # goal point\n\n---\n\nbool success                          # true if the call succeeded\nstring status                         # more details\n\ngeographic_msgs/GeoPath plan          # path to follow\n";
}
