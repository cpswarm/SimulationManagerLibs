package capabilities;

public interface GetCapabilitySpecResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/GetCapabilitySpecResponse";
  static final java.lang.String _DEFINITION = "CapabilitySpec capability_spec";
  capabilities.CapabilitySpec getCapabilitySpec();
  void setCapabilitySpec(capabilities.CapabilitySpec value);
}
