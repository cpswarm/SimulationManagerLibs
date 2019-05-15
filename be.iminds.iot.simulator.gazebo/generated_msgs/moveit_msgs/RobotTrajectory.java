package moveit_msgs;

public interface RobotTrajectory extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/RobotTrajectory";
  static final java.lang.String _DEFINITION = "trajectory_msgs/JointTrajectory joint_trajectory\ntrajectory_msgs/MultiDOFJointTrajectory multi_dof_joint_trajectory\n";
  trajectory_msgs.JointTrajectory getJointTrajectory();
  void setJointTrajectory(trajectory_msgs.JointTrajectory value);
  trajectory_msgs.MultiDOFJointTrajectory getMultiDofJointTrajectory();
  void setMultiDofJointTrajectory(trajectory_msgs.MultiDOFJointTrajectory value);
}
