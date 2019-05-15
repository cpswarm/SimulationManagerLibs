package stdr_msgs;

public interface AddThermalSourceRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/AddThermalSourceRequest";
  static final java.lang.String _DEFINITION = "stdr_msgs/ThermalSource newSource\n";
  stdr_msgs.ThermalSource getNewSource();
  void setNewSource(stdr_msgs.ThermalSource value);
}
