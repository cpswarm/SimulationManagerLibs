package brics_actuator;

public interface CartesianVector extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "brics_actuator/CartesianVector";
  static final java.lang.String _DEFINITION = "string unit\nfloat64 x\nfloat64 y\nfloat64 z\n";
  java.lang.String getUnit();
  void setUnit(java.lang.String value);
  double getX();
  void setX(double value);
  double getY();
  void setY(double value);
  double getZ();
  void setZ(double value);
}
