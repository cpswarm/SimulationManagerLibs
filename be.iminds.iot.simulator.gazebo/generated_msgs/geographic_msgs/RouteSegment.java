package geographic_msgs;

public interface RouteSegment extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/RouteSegment";
  static final java.lang.String _DEFINITION = "# Route network segment.\n#\n# This is one directed edge of a RouteNetwork graph. It represents a\n# known path from one way point to another.  If the path is two-way,\n# there will be another RouteSegment with \"start\" and \"end\" reversed.\n\nuuid_msgs/UniqueID id           # Unique identifier for this segment\n\nuuid_msgs/UniqueID start        # beginning way point of segment\nuuid_msgs/UniqueID end          # ending way point of segment\n\nKeyValue[] props                # segment properties\n";
  uuid_msgs.UniqueID getId();
  void setId(uuid_msgs.UniqueID value);
  uuid_msgs.UniqueID getStart();
  void setStart(uuid_msgs.UniqueID value);
  uuid_msgs.UniqueID getEnd();
  void setEnd(uuid_msgs.UniqueID value);
  java.util.List<geographic_msgs.KeyValue> getProps();
  void setProps(java.util.List<geographic_msgs.KeyValue> value);
}
