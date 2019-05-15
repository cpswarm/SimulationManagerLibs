package moveit_msgs;

public interface GetPositionIKRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/GetPositionIKRequest";
  static final java.lang.String _DEFINITION = "# A service call to carry out an inverse kinematics computation\n# The inverse kinematics request\nPositionIKRequest ik_request\n\n";
  moveit_msgs.PositionIKRequest getIkRequest();
  void setIkRequest(moveit_msgs.PositionIKRequest value);
}
