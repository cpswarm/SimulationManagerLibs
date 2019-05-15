package moveit_msgs;

public interface ListRobotStatesInWarehouseResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/ListRobotStatesInWarehouseResponse";
  static final java.lang.String _DEFINITION = "\nstring[] states";
  java.util.List<java.lang.String> getStates();
  void setStates(java.util.List<java.lang.String> value);
}
