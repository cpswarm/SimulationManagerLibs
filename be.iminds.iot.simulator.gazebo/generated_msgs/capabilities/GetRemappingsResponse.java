package capabilities;

public interface GetRemappingsResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/GetRemappingsResponse";
  static final java.lang.String _DEFINITION = "Remapping[] topics\nRemapping[] services\nRemapping[] actions\nRemapping[] parameters";
  java.util.List<capabilities.Remapping> getTopics();
  void setTopics(java.util.List<capabilities.Remapping> value);
  java.util.List<capabilities.Remapping> getServices();
  void setServices(java.util.List<capabilities.Remapping> value);
  java.util.List<capabilities.Remapping> getActions();
  void setActions(java.util.List<capabilities.Remapping> value);
  java.util.List<capabilities.Remapping> getParameters();
  void setParameters(java.util.List<capabilities.Remapping> value);
}
