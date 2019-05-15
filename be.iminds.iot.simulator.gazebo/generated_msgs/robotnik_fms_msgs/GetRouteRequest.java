package robotnik_fms_msgs;

public interface GetRouteRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/GetRouteRequest";
  static final java.lang.String _DEFINITION = "int32 from_node\nint32 to_node\n";
  int getFromNode();
  void setFromNode(int value);
  int getToNode();
  void setToNode(int value);
}
