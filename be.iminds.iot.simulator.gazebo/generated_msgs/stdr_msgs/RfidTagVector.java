package stdr_msgs;

public interface RfidTagVector extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/RfidTagVector";
  static final java.lang.String _DEFINITION = "# Rfid tag list\nstdr_msgs/RfidTag[] rfid_tags\n";
  java.util.List<stdr_msgs.RfidTag> getRfidTags();
  void setRfidTags(java.util.List<stdr_msgs.RfidTag> value);
}
