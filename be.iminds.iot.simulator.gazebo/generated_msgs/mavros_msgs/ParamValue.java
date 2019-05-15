package mavros_msgs;

public interface ParamValue extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/ParamValue";
  static final java.lang.String _DEFINITION = "# Parameter value storage type.\n#\n# Integer and float fields:\n#\n# if integer != 0: it is integer value\n# else if real != 0.0: it is float value\n# else: it is zero.\n\nint64 integer\nfloat64 real\n";
  long getInteger();
  void setInteger(long value);
  double getReal();
  void setReal(double value);
}
