package robotnik_fms_msgs;

public interface PresenceSensor extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/PresenceSensor";
  static final java.lang.String _DEFINITION = "int32 id\nstring zone\nstring name\nstring description\n# Valid Values Load, Unload, Load/Unload\nstring type\nbool enabled\nbool value\n# to be used to store that a change has been detected and managed\nbool ack_change\n";
  int getId();
  void setId(int value);
  java.lang.String getZone();
  void setZone(java.lang.String value);
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getDescription();
  void setDescription(java.lang.String value);
  java.lang.String getType();
  void setType(java.lang.String value);
  boolean getEnabled();
  void setEnabled(boolean value);
  boolean getValue();
  void setValue(boolean value);
  boolean getAckChange();
  void setAckChange(boolean value);
}
