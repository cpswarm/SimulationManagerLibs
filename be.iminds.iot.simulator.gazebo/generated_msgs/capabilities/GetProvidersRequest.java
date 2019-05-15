package capabilities;

public interface GetProvidersRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/GetProvidersRequest";
  static final java.lang.String _DEFINITION = "string interface\nbool include_semantic\n";
  java.lang.String getInterface();
  void setInterface(java.lang.String value);
  boolean getIncludeSemantic();
  void setIncludeSemantic(boolean value);
}
