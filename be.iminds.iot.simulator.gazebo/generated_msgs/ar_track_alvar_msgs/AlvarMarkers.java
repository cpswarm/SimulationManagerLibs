package ar_track_alvar_msgs;

public interface AlvarMarkers extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "ar_track_alvar_msgs/AlvarMarkers";
  static final java.lang.String _DEFINITION = "Header header\nAlvarMarker[] markers\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<ar_track_alvar_msgs.AlvarMarker> getMarkers();
  void setMarkers(java.util.List<ar_track_alvar_msgs.AlvarMarker> value);
}
