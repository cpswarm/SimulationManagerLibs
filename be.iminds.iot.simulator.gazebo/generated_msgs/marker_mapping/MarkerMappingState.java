package marker_mapping;

public interface MarkerMappingState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "marker_mapping/MarkerMappingState";
  static final java.lang.String _DEFINITION = "robotnik_msgs/State state\nint32[] ids_recorded\nint32[] ids_detected\n";
  robotnik_msgs.State getState();
  void setState(robotnik_msgs.State value);
  int[] getIdsRecorded();
  void setIdsRecorded(int[] value);
  int[] getIdsDetected();
  void setIdsDetected(int[] value);
}
