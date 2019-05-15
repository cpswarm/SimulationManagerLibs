package capabilities;

public interface GetNodeletManagerNameResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/GetNodeletManagerNameResponse";
  static final java.lang.String _DEFINITION = "string nodelet_manager_name";
  java.lang.String getNodeletManagerName();
  void setNodeletManagerName(java.lang.String value);
}
