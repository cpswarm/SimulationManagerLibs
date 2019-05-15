package brics_actuator;

public interface JointValue extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "brics_actuator/JointValue";
  static final java.lang.String _DEFINITION = "time timeStamp \t\t#time of the data \nstring joint_uri\nstring unit \t\t#if empy expects si units, you can use boost::unit\nfloat64 value\n";
  org.ros.message.Time getTimeStamp();
  void setTimeStamp(org.ros.message.Time value);
  java.lang.String getJointUri();
  void setJointUri(java.lang.String value);
  java.lang.String getUnit();
  void setUnit(java.lang.String value);
  double getValue();
  void setValue(double value);
}
