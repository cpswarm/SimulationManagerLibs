package brics_actuator;

public interface JointTorques extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "brics_actuator/JointTorques";
  static final java.lang.String _DEFINITION = "Poison poisonStamp\nJointValue[] torques\n";
  brics_actuator.Poison getPoisonStamp();
  void setPoisonStamp(brics_actuator.Poison value);
  java.util.List<brics_actuator.JointValue> getTorques();
  void setTorques(java.util.List<brics_actuator.JointValue> value);
}
