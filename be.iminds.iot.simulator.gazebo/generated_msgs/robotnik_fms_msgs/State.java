package robotnik_fms_msgs;

public interface State extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/State";
  static final java.lang.String _DEFINITION = "# State of the component\nrobotnik_msgs/State state\n# Number of loaded nodes\nint32 nodes\n# Number of loaded magnets\nint32 magnets\n\n";
  robotnik_msgs.State getState();
  void setState(robotnik_msgs.State value);
  int getNodes();
  void setNodes(int value);
  int getMagnets();
  void setMagnets(int value);
}
