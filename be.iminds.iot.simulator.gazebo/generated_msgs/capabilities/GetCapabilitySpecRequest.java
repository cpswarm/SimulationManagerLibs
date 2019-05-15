package capabilities;

public interface GetCapabilitySpecRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/GetCapabilitySpecRequest";
  static final java.lang.String _DEFINITION = "string capability_spec\n";
  java.lang.String getCapabilitySpec();
  void setCapabilitySpec(java.lang.String value);
}
