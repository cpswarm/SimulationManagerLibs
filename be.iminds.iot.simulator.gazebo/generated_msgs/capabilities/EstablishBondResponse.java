package capabilities;

public interface EstablishBondResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/EstablishBondResponse";
  static final java.lang.String _DEFINITION = "string bond_id";
  java.lang.String getBondId();
  void setBondId(java.lang.String value);
}
