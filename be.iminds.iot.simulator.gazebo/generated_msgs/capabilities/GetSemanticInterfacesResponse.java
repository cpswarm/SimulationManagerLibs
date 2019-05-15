package capabilities;

public interface GetSemanticInterfacesResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/GetSemanticInterfacesResponse";
  static final java.lang.String _DEFINITION = "string[] semantic_interfaces";
  java.util.List<java.lang.String> getSemanticInterfaces();
  void setSemanticInterfaces(java.util.List<java.lang.String> value);
}
