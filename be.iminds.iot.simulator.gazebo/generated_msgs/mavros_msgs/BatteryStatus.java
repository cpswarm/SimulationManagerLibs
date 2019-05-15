package mavros_msgs;

public interface BatteryStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/BatteryStatus";
  static final java.lang.String _DEFINITION = "# Represent battery status from SYSTEM_STATUS\n#\n# To be replaced when sensor_msgs/BatteryState PR will be merged\n# https://github.com/ros/common_msgs/pull/74\n\nstd_msgs/Header header\nfloat32 voltage # [V]\nfloat32 current # [A]\nfloat32 remaining # 0..1\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getVoltage();
  void setVoltage(float value);
  float getCurrent();
  void setCurrent(float value);
  float getRemaining();
  void setRemaining(float value);
}
