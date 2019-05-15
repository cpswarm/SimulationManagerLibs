package robotnik_fms_msgs;

public interface NodesInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/NodesInfo";
  static final java.lang.String _DEFINITION = "robotnik_fms_msgs/NodeInfo[] Nodes\n";
  java.util.List<robotnik_fms_msgs.NodeInfo> getNodes();
  void setNodes(java.util.List<robotnik_fms_msgs.NodeInfo> value);
}
