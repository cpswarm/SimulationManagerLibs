package robotnik_msgs;

public interface Interfaces extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/Interfaces";
  static final java.lang.String _DEFINITION = "# Contains the total number of bytes and pkts\nData total\n# Contains information of every interface\nData[] interfaces\n\n";
  robotnik_msgs.Data getTotal();
  void setTotal(robotnik_msgs.Data value);
  java.util.List<robotnik_msgs.Data> getInterfaces();
  void setInterfaces(java.util.List<robotnik_msgs.Data> value);
}
