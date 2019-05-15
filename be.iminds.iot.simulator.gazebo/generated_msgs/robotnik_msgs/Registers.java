package robotnik_msgs;

public interface Registers extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/Registers";
  static final java.lang.String _DEFINITION = "robotnik_msgs/Register[] registers";
  java.util.List<robotnik_msgs.Register> getRegisters();
  void setRegisters(java.util.List<robotnik_msgs.Register> value);
}
