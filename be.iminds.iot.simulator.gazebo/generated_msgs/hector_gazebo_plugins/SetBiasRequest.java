package hector_gazebo_plugins;

public interface SetBiasRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "hector_gazebo_plugins/SetBiasRequest";
  static final java.lang.String _DEFINITION = "geometry_msgs/Vector3 bias\n";
  geometry_msgs.Vector3 getBias();
  void setBias(geometry_msgs.Vector3 value);
}
