package nmea_msgs;

public interface Sentence extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "nmea_msgs/Sentence";
  static final java.lang.String _DEFINITION = "# A message representing a single NMEA0183 sentence.\n\n# header.stamp is the ROS Time when the sentence was read.\n# header.frame_id is the frame of reference reported by the satellite\n#        receiver, usually the location of the antenna.  This is a\n#        Euclidean frame relative to the vehicle, not a reference\n#        ellipsoid.\nHeader header\n\n# This should only contain ASCII characters in order to be a valid NMEA0183 sentence.\nstring sentence\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.lang.String getSentence();
  void setSentence(java.lang.String value);
}
