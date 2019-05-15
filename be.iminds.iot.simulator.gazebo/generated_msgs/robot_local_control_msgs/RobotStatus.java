package robot_local_control_msgs;

public interface RobotStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_local_control_msgs/RobotStatus";
  static final java.lang.String _DEFINITION = "# robot battery\nrobotnik_msgs/BatteryStatus battery\n\n# Robot emergency stop\nbool emergency_stop\n\n# lights\n# acoustic signal\n# bool acoustic_signal\n\n# Robot internal odometry\nPose2DStamped pose\nTwist2D velocity\n\nSensorStatus[] sensors\nrobotnik_msgs/ElevatorStatus elevator\n";
  robotnik_msgs.BatteryStatus getBattery();
  void setBattery(robotnik_msgs.BatteryStatus value);
  boolean getEmergencyStop();
  void setEmergencyStop(boolean value);
  robot_local_control_msgs.Pose2DStamped getPose();
  void setPose(robot_local_control_msgs.Pose2DStamped value);
  robot_local_control_msgs.Twist2D getVelocity();
  void setVelocity(robot_local_control_msgs.Twist2D value);
  java.util.List<robot_local_control_msgs.SensorStatus> getSensors();
  void setSensors(java.util.List<robot_local_control_msgs.SensorStatus> value);
  robotnik_msgs.ElevatorStatus getElevator();
  void setElevator(robotnik_msgs.ElevatorStatus value);
}
