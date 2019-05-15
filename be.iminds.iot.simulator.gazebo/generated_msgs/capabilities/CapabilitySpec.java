package capabilities;

public interface CapabilitySpec extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "capabilities/CapabilitySpec";
  static final java.lang.String _DEFINITION = "# Package which contains this spec file\nstring package\n\n# Type of spec file, one of:\n#   \'capability_interface\'\n#   \'semantic_capability_interface\'\n#   \'capability_provider\'\nstring type\n\n# Raw string content of the spec file\nstring content\n\n# The name of the default provider (pulled from ROS param\'s)\n# (only used for capability_interface specs)\nstring default_provider\n";
  java.lang.String getPackage();
  void setPackage(java.lang.String value);
  java.lang.String getType();
  void setType(java.lang.String value);
  java.lang.String getContent();
  void setContent(java.lang.String value);
  java.lang.String getDefaultProvider();
  void setDefaultProvider(java.lang.String value);
}
