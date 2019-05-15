package stdr_msgs;

public interface RfidSensorMeasurementMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/RfidSensorMeasurementMsg";
  static final java.lang.String _DEFINITION = "# Rfid sensor measurement description - all vectors must have the same size\nHeader header\n\nstring[] rfid_tags_ids\nstring[] rfid_tags_msgs\nfloat32[] rfid_tags_dbs\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<java.lang.String> getRfidTagsIds();
  void setRfidTagsIds(java.util.List<java.lang.String> value);
  java.util.List<java.lang.String> getRfidTagsMsgs();
  void setRfidTagsMsgs(java.util.List<java.lang.String> value);
  float[] getRfidTagsDbs();
  void setRfidTagsDbs(float[] value);
}
