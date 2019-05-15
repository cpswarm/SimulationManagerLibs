package geographic_msgs;

public interface GetGeoPathRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GetGeoPathRequest";
  static final java.lang.String _DEFINITION = "# Searches for given start and goal the nearest route segments\n# and determine the path through the RouteNetwork\n\ngeographic_msgs/GeoPoint start        # starting point\ngeographic_msgs/GeoPoint goal         # goal point\n\n";
  geographic_msgs.GeoPoint getStart();
  void setStart(geographic_msgs.GeoPoint value);
  geographic_msgs.GeoPoint getGoal();
  void setGoal(geographic_msgs.GeoPoint value);
}
