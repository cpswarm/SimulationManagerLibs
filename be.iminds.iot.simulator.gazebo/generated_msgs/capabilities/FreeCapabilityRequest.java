package capabilities;

public interface FreeCapabilityRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/FreeCapabilityRequest";
  static final java.lang.String _DEFINITION = "string capability\nstring bond_id\n";
  java.lang.String getCapability();
  void setCapability(java.lang.String value);
  java.lang.String getBondId();
  void setBondId(java.lang.String value);
}
