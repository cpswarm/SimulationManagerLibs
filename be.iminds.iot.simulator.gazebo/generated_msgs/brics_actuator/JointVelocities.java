package brics_actuator;

public interface JointVelocities extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "brics_actuator/JointVelocities";
  static final java.lang.String _DEFINITION = "Poison poisonStamp\nJointValue[] velocities\n";
  brics_actuator.Poison getPoisonStamp();
  void setPoisonStamp(brics_actuator.Poison value);
  java.util.List<brics_actuator.JointValue> getVelocities();
  void setVelocities(java.util.List<brics_actuator.JointValue> value);
}
