package rocon_std_msgs;

public interface ConnectionsList extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_std_msgs/ConnectionsList";
  static final java.lang.String _DEFINITION = "Connection[] connections";
  java.util.List<rocon_std_msgs.Connection> getConnections();
  void setConnections(java.util.List<rocon_std_msgs.Connection> value);
}
