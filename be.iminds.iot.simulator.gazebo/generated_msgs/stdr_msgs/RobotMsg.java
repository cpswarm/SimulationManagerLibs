package stdr_msgs;

public interface RobotMsg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/RobotMsg";
  static final java.lang.String _DEFINITION = "geometry_msgs/Pose2D initialPose\n\nstdr_msgs/FootprintMsg footprint\n\nstdr_msgs/LaserSensorMsg[] laserSensors\nstdr_msgs/SonarSensorMsg[] sonarSensors\nstdr_msgs/RfidSensorMsg[] rfidSensors\nstdr_msgs/CO2SensorMsg[] co2Sensors\nstdr_msgs/SoundSensorMsg[] soundSensors\nstdr_msgs/ThermalSensorMsg[] thermalSensors\n\nstdr_msgs/KinematicMsg kinematicModel\n";
  geometry_msgs.Pose2D getInitialPose();
  void setInitialPose(geometry_msgs.Pose2D value);
  stdr_msgs.FootprintMsg getFootprint();
  void setFootprint(stdr_msgs.FootprintMsg value);
  java.util.List<stdr_msgs.LaserSensorMsg> getLaserSensors();
  void setLaserSensors(java.util.List<stdr_msgs.LaserSensorMsg> value);
  java.util.List<stdr_msgs.SonarSensorMsg> getSonarSensors();
  void setSonarSensors(java.util.List<stdr_msgs.SonarSensorMsg> value);
  java.util.List<stdr_msgs.RfidSensorMsg> getRfidSensors();
  void setRfidSensors(java.util.List<stdr_msgs.RfidSensorMsg> value);
  java.util.List<stdr_msgs.CO2SensorMsg> getCo2Sensors();
  void setCo2Sensors(java.util.List<stdr_msgs.CO2SensorMsg> value);
  java.util.List<stdr_msgs.SoundSensorMsg> getSoundSensors();
  void setSoundSensors(java.util.List<stdr_msgs.SoundSensorMsg> value);
  java.util.List<stdr_msgs.ThermalSensorMsg> getThermalSensors();
  void setThermalSensors(java.util.List<stdr_msgs.ThermalSensorMsg> value);
  stdr_msgs.KinematicMsg getKinematicModel();
  void setKinematicModel(stdr_msgs.KinematicMsg value);
}
