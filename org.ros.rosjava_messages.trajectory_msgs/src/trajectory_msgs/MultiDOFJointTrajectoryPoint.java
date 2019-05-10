package trajectory_msgs;

public interface MultiDOFJointTrajectoryPoint extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "trajectory_msgs/MultiDOFJointTrajectoryPoint";
  static final java.lang.String _DEFINITION = "# Each multi-dof joint can specify a transform (up to 6 DOF)\n" + 
  		"geometry_msgs/Transform[] transforms\n" + 
  		"\n" + 
  		"# There can be a velocity specified for the origin of the joint \n" + 
  		"geometry_msgs/Twist[] velocities\n" + 
  		"\n" + 
  		"# There can be an acceleration specified for the origin of the joint \n" + 
  		"geometry_msgs/Twist[] accelerations\n" + 
  		"\n" + 
  		"duration time_from_start";
  java.util.List<geometry_msgs.Transform> getTransforms();
  void setTransforms(java.util.List<geometry_msgs.Transform> value);
  java.util.List<geometry_msgs.Twist> getVelocities();
  void setVelocities(java.util.List<geometry_msgs.Twist> value);
  java.util.List<geometry_msgs.Twist> getAccelerations();
  void setAccelerations(java.util.List<geometry_msgs.Twist> value);
  org.ros.message.Duration getTimeFromStart();
  void setTimeFromStart(org.ros.message.Duration value);
}
