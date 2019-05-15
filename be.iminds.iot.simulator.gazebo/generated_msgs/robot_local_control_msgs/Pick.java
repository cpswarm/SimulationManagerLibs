package robot_local_control_msgs;

public interface Pick extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/Pick";
  static final java.lang.String _DEFINITION = "string pick_frame_id # object, represented by its frame, that is to be picked\n";
  java.lang.String getPickFrameId();
  void setPickFrameId(java.lang.String value);
}
