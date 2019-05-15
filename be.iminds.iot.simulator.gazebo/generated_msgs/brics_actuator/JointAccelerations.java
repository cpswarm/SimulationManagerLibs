package brics_actuator;

public interface JointAccelerations extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "brics_actuator/JointAccelerations";
  static final java.lang.String _DEFINITION = "Poison poisonStamp\nJointValue[] accelerations\n";
  brics_actuator.Poison getPoisonStamp();
  void setPoisonStamp(brics_actuator.Poison value);
  java.util.List<brics_actuator.JointValue> getAccelerations();
  void setAccelerations(java.util.List<brics_actuator.JointValue> value);
}
