package gazebo_msgs;

public interface ModelState extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gazebo_msgs/ModelState";
  static final java.lang.String _DEFINITION = "# Set Gazebo Model pose and twist\n" + 
  		"string model_name           # model to set state (pose and twist)\n" + 
  		"geometry_msgs/Pose pose     # desired pose in reference frame\n" + 
  		"geometry_msgs/Twist twist   # desired twist in reference frame\n" + 
  		"string reference_frame      # set pose/twist relative to the frame of this entity (Body/Model)\n" + 
  		"                            # leave empty or \"world\" or \"map\" defaults to world-frame\n" + 
  		"";
  java.lang.String getModelName();
  void setModelName(java.lang.String value);
  geometry_msgs.Pose getPose();
  void setPose(geometry_msgs.Pose value);
  geometry_msgs.Twist getTwist();
  void setTwist(geometry_msgs.Twist value);
  java.lang.String getReferenceFrame();
  void setReferenceFrame(java.lang.String value);
}
