package geographic_msgs;

public interface RoutePath extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/RoutePath";
  static final java.lang.String _DEFINITION = "# Path through a route network.\n#\n# A path is a sequence of RouteSegment edges.  This information is\n# extracted from a RouteNetwork graph.  A RoutePath lists the route\n# segments needed to reach some chosen goal.\n\nHeader header\n\nuuid_msgs/UniqueID   network    # Route network containing this path\nuuid_msgs/UniqueID[] segments   # Sequence of RouteSegment IDs\nKeyValue[]           props      # Key/value properties\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  uuid_msgs.UniqueID getNetwork();
  void setNetwork(uuid_msgs.UniqueID value);
  java.util.List<uuid_msgs.UniqueID> getSegments();
  void setSegments(java.util.List<uuid_msgs.UniqueID> value);
  java.util.List<geographic_msgs.KeyValue> getProps();
  void setProps(java.util.List<geographic_msgs.KeyValue> value);
}
