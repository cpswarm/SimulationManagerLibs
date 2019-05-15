package stdr_msgs;

public interface LoadExternalMapRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/LoadExternalMapRequest";
  static final java.lang.String _DEFINITION = "nav_msgs/OccupancyGrid  map\n";
  nav_msgs.OccupancyGrid getMap();
  void setMap(nav_msgs.OccupancyGrid value);
}
