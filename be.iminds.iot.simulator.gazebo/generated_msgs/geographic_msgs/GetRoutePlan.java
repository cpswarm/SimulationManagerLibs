package geographic_msgs;

public interface GetRoutePlan extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GetRoutePlan";
  static final java.lang.String _DEFINITION = "# Get a plan to traverse a route network from start to goal.\n#\n# Similar to nav_msgs/GetPlan, but constrained to use the route network.\n\nuuid_msgs/UniqueID network      # route network to use\nuuid_msgs/UniqueID start        # starting way point\nuuid_msgs/UniqueID goal         # goal way point\n\n---\n\nbool            success         # true if the call succeeded\nstring          status          # more details\n\nRoutePath       plan            # path to follow\n";
}
