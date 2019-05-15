package brics_actuator;

public interface JointConstraint extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "brics_actuator/JointConstraint";
  static final java.lang.String _DEFINITION = "string type  \t\t#smaller, greater, equal or <, >, =\nJointValue value\n";
  java.lang.String getType();
  void setType(java.lang.String value);
  brics_actuator.JointValue getValue();
  void setValue(brics_actuator.JointValue value);
}
