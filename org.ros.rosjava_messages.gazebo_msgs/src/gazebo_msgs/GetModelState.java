package gazebo_msgs;

public interface GetModelState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gazebo_msgs/GetModelState";
  static final java.lang.String _DEFINITION = "string model_name                    # name of Gazebo Model\n" + 
  		"string relative_entity_name          # return pose and twist relative to this entity\n" + 
  		"                                     # an entity can be a model, body, or geom\n" + 
  		"                                     # be sure to use gazebo scoped naming notation (e.g. [model_name::body_name])\n" + 
  		"                                     # leave empty or \"world\" will use inertial world frame\n" + 
  		"---\n" + 
  		"Header header                        # Standard metadata for higher-level stamped data types.\n" + 
  		"                                     # * header.seq holds the number of requests since the plugin started\n" + 
  		"                                     # * header.stamp timestamp related to the pose\n" + 
  		"                                     # * header.frame_id not used but currently filled with the relative_entity_name\n" + 
  		"geometry_msgs/Pose pose              # pose of model in relative entity frame\n" + 
  		"geometry_msgs/Twist twist            # twist of model in relative entity frame\n" + 
  		"bool success                         # return true if get successful\n" + 
  		"string status_message                # comments if available";
}