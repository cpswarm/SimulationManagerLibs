package capabilities;

public interface UseCapabilityRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/UseCapabilityRequest";
  static final java.lang.String _DEFINITION = "string capability\nstring preferred_provider\nstring bond_id\n";
  java.lang.String getCapability();
  void setCapability(java.lang.String value);
  java.lang.String getPreferredProvider();
  void setPreferredProvider(java.lang.String value);
  java.lang.String getBondId();
  void setBondId(java.lang.String value);
}
