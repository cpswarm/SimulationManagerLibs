package gazebo_msgs;

public interface GetModelProperties extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gazebo_msgs/GetModelProperties";
  static final java.lang.String _DEFINITION = "string model_name                    # name of Gazebo Model\n" + 
  		"---\n" + 
  		"string parent_model_name             # parent model\n" + 
  		"string canonical_body_name           # name of canonical body, body names are prefixed by model name, e.g. pr2::base_link\n" + 
  		"string[] body_names                  # list of bodies, body names are prefixed by model name, e.g. pr2::base_link\n" + 
  		"string[] geom_names                  # list of geoms\n" + 
  		"string[] joint_names                 # list of joints attached to the model\n" + 
  		"string[] child_model_names           # list of child models\n" + 
  		"bool is_static                       # returns true if model is static\n" + 
  		"bool success                         # return true if get successful\n" + 
  		"string status_message                # comments if available";
}
