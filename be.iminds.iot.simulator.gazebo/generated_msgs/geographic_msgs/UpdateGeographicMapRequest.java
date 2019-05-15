package geographic_msgs;

public interface UpdateGeographicMapRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/UpdateGeographicMapRequest";
  static final java.lang.String _DEFINITION = "# This service updates a geographic map.\n\n# Changes to geographic map.\nGeographicMapChanges updates\n\n";
  geographic_msgs.GeographicMapChanges getUpdates();
  void setUpdates(geographic_msgs.GeographicMapChanges value);
}
