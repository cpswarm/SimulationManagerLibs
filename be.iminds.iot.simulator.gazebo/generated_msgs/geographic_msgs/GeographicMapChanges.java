package geographic_msgs;

public interface GeographicMapChanges extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/GeographicMapChanges";
  static final java.lang.String _DEFINITION = "# A list of geographic map changes.\n\nHeader header                   # stamp specifies time of change\n                                # frame_id (normally /map)\n\nGeographicMap diffs             # new and changed points and features\nuuid_msgs/UniqueID[] deletes    # deleted map components\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  geographic_msgs.GeographicMap getDiffs();
  void setDiffs(geographic_msgs.GeographicMap value);
  java.util.List<uuid_msgs.UniqueID> getDeletes();
  void setDeletes(java.util.List<uuid_msgs.UniqueID> value);
}
