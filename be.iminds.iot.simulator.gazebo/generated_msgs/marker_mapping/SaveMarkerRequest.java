package marker_mapping;

public interface SaveMarkerRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "marker_mapping/SaveMarkerRequest";
  static final java.lang.String _DEFINITION = "# List of markers to save (if no one, it saves any marker detected)\nuint32[] id\n# (optional) Filename to save the marker list\nstring filename\n";
  int[] getId();
  void setId(int[] value);
  java.lang.String getFilename();
  void setFilename(java.lang.String value);
}
