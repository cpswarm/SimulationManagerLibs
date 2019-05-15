package geographic_msgs;

public interface WayPoint extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/WayPoint";
  static final java.lang.String _DEFINITION = "# Way-point element for a geographic map.\n\nuuid_msgs/UniqueID id   # Unique way-point identifier\nGeoPoint   position     # Position relative to WGS 84 ellipsoid\nKeyValue[] props        # Key/value properties for this point\n";
  uuid_msgs.UniqueID getId();
  void setId(uuid_msgs.UniqueID value);
  geographic_msgs.GeoPoint getPosition();
  void setPosition(geographic_msgs.GeoPoint value);
  java.util.List<geographic_msgs.KeyValue> getProps();
  void setProps(java.util.List<geographic_msgs.KeyValue> value);
}
