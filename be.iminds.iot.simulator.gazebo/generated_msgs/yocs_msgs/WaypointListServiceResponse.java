package yocs_msgs;

public interface WaypointListServiceResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/WaypointListServiceResponse";
  static final java.lang.String _DEFINITION = "bool success\nWaypointList waypoints";
  boolean getSuccess();
  void setSuccess(boolean value);
  yocs_msgs.WaypointList getWaypoints();
  void setWaypoints(yocs_msgs.WaypointList value);
}
