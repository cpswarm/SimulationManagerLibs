package robotnik_fms_msgs;

public interface PresenceSensorArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_fms_msgs/PresenceSensorArray";
  static final java.lang.String _DEFINITION = "robotnik_fms_msgs/PresenceSensor[] Sensors\n";
  java.util.List<robotnik_fms_msgs.PresenceSensor> getSensors();
  void setSensors(java.util.List<robotnik_fms_msgs.PresenceSensor> value);
}
