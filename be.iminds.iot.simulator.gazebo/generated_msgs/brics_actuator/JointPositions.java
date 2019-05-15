package brics_actuator;

public interface JointPositions extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "brics_actuator/JointPositions";
  static final java.lang.String _DEFINITION = "Poison poisonStamp\nJointValue[] positions\n";
  brics_actuator.Poison getPoisonStamp();
  void setPoisonStamp(brics_actuator.Poison value);
  java.util.List<brics_actuator.JointValue> getPositions();
  void setPositions(java.util.List<brics_actuator.JointValue> value);
}
