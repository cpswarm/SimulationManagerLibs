package kobuki_msgs;

public interface ExternalPower extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/ExternalPower";
  static final java.lang.String _DEFINITION = "# Turn on/off Kobuki\'s external power sources\n\n# Power sources\nuint8 PWR_3_3V1A  = 0 # DB25 connector only\nuint8 PWR_5V1A    = 1 # DB25 connector and Micro Molex connector\nuint8 PWR_12V5A   = 2 # Micro Molex connector only\nuint8 PWR_12V1_5A = 3 # Micro Molex connector only\n\n# State\nuint8 OFF = 0\nuint8 ON  = 1\n\nuint8 source\n\nuint8 state";
  static final byte PWR_3_3V1A = 0;
  static final byte PWR_5V1A = 1;
  static final byte PWR_12V5A = 2;
  static final byte PWR_12V1_5A = 3;
  static final byte OFF = 0;
  static final byte ON = 1;
  byte getSource();
  void setSource(byte value);
  byte getState();
  void setState(byte value);
}
