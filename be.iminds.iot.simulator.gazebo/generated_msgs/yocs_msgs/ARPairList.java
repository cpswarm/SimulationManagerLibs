package yocs_msgs;

public interface ARPairList extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/ARPairList";
  static final java.lang.String _DEFINITION = "ARPair[] pairs\n";
  java.util.List<yocs_msgs.ARPair> getPairs();
  void setPairs(java.util.List<yocs_msgs.ARPair> value);
}
