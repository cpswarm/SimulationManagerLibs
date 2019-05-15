package mavros_msgs;

public interface DebugValue extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/DebugValue";
  static final java.lang.String _DEFINITION = "# Msg for Debug MAVLink API\n#\n# Supported types:\n# DEBUG\t\t\thttp://mavlink.org/messages/common#DEBUG\n# DEBUG_VECTOR\t\t\thttp://mavlink.org/messages/common#DEBUG_VECT\n# NAMED_VALUE_FLOAT\t\thttp://mavlink.org/messages/common#NAMED_VALUE_FLOAT\n# NAMED_VALUE_INT\t\thttp://mavlink.org/messages/common#NAMED_VALUE_INT\n# @TODO: add support for DEBUG_ARRAY (https://github.com/mavlink/mavlink/pull/734)\n\nstd_msgs/Header header\n\nint32 index\t\t\t# index value of DEBUG value (-1 if not indexed)\n\nstring name\t\t\t# value name/key\n\nfloat32 value_float\t\t# float value for NAMED_VALUE_FLOAT and DEBUG\nint32 value_int\t\t# int value for NAMED_VALUE_INT\nfloat32[] data\t\t\t# DEBUG vector or array\n\nuint8 type\nuint8 TYPE_DEBUG\t\t= 0\nuint8 TYPE_DEBUG_VECT\t\t= 1\nuint8 TYPE_DEBUG_ARRAY\t\t= 2\nuint8 TYPE_NAMED_VALUE_FLOAT\t= 3\nuint8 TYPE_NAMED_VALUE_INT\t= 4\n";
  static final byte TYPE_DEBUG = 0;
  static final byte TYPE_DEBUG_VECT = 1;
  static final byte TYPE_DEBUG_ARRAY = 2;
  static final byte TYPE_NAMED_VALUE_FLOAT = 3;
  static final byte TYPE_NAMED_VALUE_INT = 4;
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  int getIndex();
  void setIndex(int value);
  java.lang.String getName();
  void setName(java.lang.String value);
  float getValueFloat();
  void setValueFloat(float value);
  int getValueInt();
  void setValueInt(int value);
  float[] getData();
  void setData(float[] value);
  byte getType();
  void setType(byte value);
}
