package capabilities;

public interface GetInterfacesResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/GetInterfacesResponse";
  static final java.lang.String _DEFINITION = "string[] interfaces";
  java.util.List<java.lang.String> getInterfaces();
  void setInterfaces(java.util.List<java.lang.String> value);
}
