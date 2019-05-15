package marker_mapping;

public interface InitPoseFromMarkerRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "marker_mapping/InitPoseFromMarkerRequest";
  static final java.lang.String _DEFINITION = "# Marker selected to load\nuint32[] id\n";
  int[] getId();
  void setId(int[] value);
}
