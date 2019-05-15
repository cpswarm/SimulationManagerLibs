package robotnik_msgs;

public interface BatteryStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/BatteryStatus";
  static final java.lang.String _DEFINITION = "float32 voltage\t\t\t# in volts\nfloat32 level\t\t\t# in %\nuint32 time_remaining\t\t# in minutes\nuint32 time_charging            # in minutes \nbool is_charging                # true when connected\n";
  float getVoltage();
  void setVoltage(float value);
  float getLevel();
  void setLevel(float value);
  int getTimeRemaining();
  void setTimeRemaining(int value);
  int getTimeCharging();
  void setTimeCharging(int value);
  boolean getIsCharging();
  void setIsCharging(boolean value);
}
