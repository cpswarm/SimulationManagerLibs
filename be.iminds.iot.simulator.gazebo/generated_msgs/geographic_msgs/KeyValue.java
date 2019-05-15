package geographic_msgs;

public interface KeyValue extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "geographic_msgs/KeyValue";
  static final java.lang.String _DEFINITION = "# Geographic map tag (key, value) pair\n#\n# This is equivalent to diagnostic_msgs/KeyValue, repeated here to\n# avoid introducing a trivial stack dependency.\n\nstring key                     # tag label\nstring value                   # corresponding value\n";
  java.lang.String getKey();
  void setKey(java.lang.String value);
  java.lang.String getValue();
  void setValue(java.lang.String value);
}
