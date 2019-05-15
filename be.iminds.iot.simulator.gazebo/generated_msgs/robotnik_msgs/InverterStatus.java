package robotnik_msgs;

public interface InverterStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/InverterStatus";
  static final java.lang.String _DEFINITION = "Header  header\nfloat32 ac_voltage       # Output Voltage in Volts (Mandatory)\nfloat32 dc_voltage       # Input Voltage in Volts (If unmeasured NaN)\nfloat32 load             # Current percentage load on 0 to 1 range (If unmeasured NaN)\nfloat32 percentage       # Charge percentage on 0 to 1 range (If unmeasured NaN)\nfloat32 temperature      # Current temperature in centigrads (If unmeasured NaN)\nbool    on               # True if the inverter is on\n\nstring serial_number     # The best approximation of the battery serial number\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  float getAcVoltage();
  void setAcVoltage(float value);
  float getDcVoltage();
  void setDcVoltage(float value);
  float getLoad();
  void setLoad(float value);
  float getPercentage();
  void setPercentage(float value);
  float getTemperature();
  void setTemperature(float value);
  boolean getOn();
  void setOn(boolean value);
  java.lang.String getSerialNumber();
  void setSerialNumber(java.lang.String value);
}
