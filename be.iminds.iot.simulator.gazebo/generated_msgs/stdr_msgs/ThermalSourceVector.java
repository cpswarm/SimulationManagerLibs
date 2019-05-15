package stdr_msgs;

public interface ThermalSourceVector extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/ThermalSourceVector";
  static final java.lang.String _DEFINITION = "# Thermal sources list\nstdr_msgs/ThermalSource[] thermal_sources\n";
  java.util.List<stdr_msgs.ThermalSource> getThermalSources();
  void setThermalSources(java.util.List<stdr_msgs.ThermalSource> value);
}
