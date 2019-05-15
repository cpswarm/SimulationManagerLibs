package geographic_msgs;

public interface UpdateGeographicMap extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/UpdateGeographicMap";
  static final java.lang.String _DEFINITION = "# This service updates a geographic map.\n\n# Changes to geographic map.\nGeographicMapChanges updates\n\n---\n\nbool   success        # true if the call succeeded\nstring status         # more details\n";
}
