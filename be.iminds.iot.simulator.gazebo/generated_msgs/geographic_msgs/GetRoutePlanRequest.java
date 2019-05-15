package geographic_msgs;

public interface GetRoutePlanRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GetRoutePlanRequest";
  static final java.lang.String _DEFINITION = "# Get a plan to traverse a route network from start to goal.\n#\n# Similar to nav_msgs/GetPlan, but constrained to use the route network.\n\nuuid_msgs/UniqueID network      # route network to use\nuuid_msgs/UniqueID start        # starting way point\nuuid_msgs/UniqueID goal         # goal way point\n\n";
  uuid_msgs.UniqueID getNetwork();
  void setNetwork(uuid_msgs.UniqueID value);
  uuid_msgs.UniqueID getStart();
  void setStart(uuid_msgs.UniqueID value);
  uuid_msgs.UniqueID getGoal();
  void setGoal(uuid_msgs.UniqueID value);
}
