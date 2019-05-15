package capabilities;

public interface GetProvidersResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/GetProvidersResponse";
  static final java.lang.String _DEFINITION = "string[] providers\nstring default_provider";
  java.util.List<java.lang.String> getProviders();
  void setProviders(java.util.List<java.lang.String> value);
  java.lang.String getDefaultProvider();
  void setDefaultProvider(java.lang.String value);
}
