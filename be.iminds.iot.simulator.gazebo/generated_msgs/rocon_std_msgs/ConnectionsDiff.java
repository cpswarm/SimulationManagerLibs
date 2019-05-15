package rocon_std_msgs;

public interface ConnectionsDiff extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "rocon_std_msgs/ConnectionsDiff";
  static final java.lang.String _DEFINITION = "Connection[] added\nConnection[] lost";
  java.util.List<rocon_std_msgs.Connection> getAdded();
  void setAdded(java.util.List<rocon_std_msgs.Connection> value);
  java.util.List<rocon_std_msgs.Connection> getLost();
  void setLost(java.util.List<rocon_std_msgs.Connection> value);
}
