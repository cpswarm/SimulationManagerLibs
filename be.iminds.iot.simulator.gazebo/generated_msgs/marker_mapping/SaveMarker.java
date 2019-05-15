package marker_mapping;

public interface SaveMarker extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "marker_mapping/SaveMarker";
  static final java.lang.String _DEFINITION = "# List of markers to save (if no one, it saves any marker detected)\nuint32[] id\n# (optional) Filename to save the marker list\nstring filename\n---\nbool ret\n";
}
