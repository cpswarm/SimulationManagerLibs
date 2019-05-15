package mavros_msgs;

public interface RadioStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/RadioStatus";
  static final java.lang.String _DEFINITION = "# RADIO_STATUS message\n\nstd_msgs/Header header\n\n# message data\nuint8 rssi\nuint8 remrssi\nuint8 txbuf\nuint8 noise\nuint8 remnoise\nuint16 rxerrors\nuint16 fixed\n\n# calculated\nfloat32 rssi_dbm\nfloat32 remrssi_dbm\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  byte getRssi();
  void setRssi(byte value);
  byte getRemrssi();
  void setRemrssi(byte value);
  byte getTxbuf();
  void setTxbuf(byte value);
  byte getNoise();
  void setNoise(byte value);
  byte getRemnoise();
  void setRemnoise(byte value);
  short getRxerrors();
  void setRxerrors(short value);
  short getFixed();
  void setFixed(short value);
  float getRssiDbm();
  void setRssiDbm(float value);
  float getRemrssiDbm();
  void setRemrssiDbm(float value);
}
