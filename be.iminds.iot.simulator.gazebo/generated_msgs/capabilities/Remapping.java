package capabilities;

public interface Remapping extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/Remapping";
  static final java.lang.String _DEFINITION = "string key\nstring value\n";
  java.lang.String getKey();
  void setKey(java.lang.String value);
  java.lang.String getValue();
  void setValue(java.lang.String value);
}
