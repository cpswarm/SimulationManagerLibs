package gazebo_msgs;

public interface SetModelState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gazebo_msgs/SetModelState";
  static final java.lang.String _DEFINITION = "gazebo_msgs/ModelState model_state\n" + 
  		"---\n" + 
  		"bool success                  # return true if setting state successful\n" + 
  		"string status_message         # comments if available";
}
