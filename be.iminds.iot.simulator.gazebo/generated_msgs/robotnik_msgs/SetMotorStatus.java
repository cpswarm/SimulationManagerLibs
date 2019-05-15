package robotnik_msgs;

public interface SetMotorStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/SetMotorStatus";
  static final java.lang.String _DEFINITION = "# Avalilable status\n# 0-> POWER_ENABLED\n# 1-> QUICK_STOP\n# 2-> POWER_DISABLED (READY_TO_SWITCH_ON)\nint8 status\n---\nbool ret \n";
}
