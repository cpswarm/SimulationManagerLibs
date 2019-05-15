package stdr_msgs;

public interface CO2SourceVector extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "stdr_msgs/CO2SourceVector";
  static final java.lang.String _DEFINITION = "# CO2 sources list\n\nstdr_msgs/CO2Source[] co2_sources\n";
  java.util.List<stdr_msgs.CO2Source> getCo2Sources();
  void setCo2Sources(java.util.List<stdr_msgs.CO2Source> value);
}
