package capabilities;

public interface GetCapabilitySpecsResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/GetCapabilitySpecsResponse";
  static final java.lang.String _DEFINITION = "CapabilitySpec[] capability_specs";
  java.util.List<capabilities.CapabilitySpec> getCapabilitySpecs();
  void setCapabilitySpecs(java.util.List<capabilities.CapabilitySpec> value);
}
