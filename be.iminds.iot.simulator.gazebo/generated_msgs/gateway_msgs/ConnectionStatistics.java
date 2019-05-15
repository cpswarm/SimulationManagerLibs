package gateway_msgs;

public interface ConnectionStatistics extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "gateway_msgs/ConnectionStatistics";
  static final java.lang.String _DEFINITION = "# Constants\nint8 WIRED = 1\nint8 WIRELESS = 2\nint32 MAX_TTL = 86400\n\n# Gateway ping indicators\nbool gateway_available\nint64 time_since_last_seen #time in seconds since last ping successful\nfloat32 ping_latency_min\nfloat32 ping_latency_max\nfloat32 ping_latency_avg\nfloat32 ping_latency_mdev #mean absolute deviation\n\n# Gateway network information indicators\nbool network_info_available\nint8 network_type\nfloat32 wireless_bitrate\nint8 wireless_link_quality\nfloat32 wireless_signal_level\nfloat32 wireless_noise_level\n\n\n";
  static final byte WIRED = 1;
  static final byte WIRELESS = 2;
  static final int MAX_TTL = 86400;
  boolean getGatewayAvailable();
  void setGatewayAvailable(boolean value);
  long getTimeSinceLastSeen();
  void setTimeSinceLastSeen(long value);
  float getPingLatencyMin();
  void setPingLatencyMin(float value);
  float getPingLatencyMax();
  void setPingLatencyMax(float value);
  float getPingLatencyAvg();
  void setPingLatencyAvg(float value);
  float getPingLatencyMdev();
  void setPingLatencyMdev(float value);
  boolean getNetworkInfoAvailable();
  void setNetworkInfoAvailable(boolean value);
  byte getNetworkType();
  void setNetworkType(byte value);
  float getWirelessBitrate();
  void setWirelessBitrate(float value);
  byte getWirelessLinkQuality();
  void setWirelessLinkQuality(byte value);
  float getWirelessSignalLevel();
  void setWirelessSignalLevel(float value);
  float getWirelessNoiseLevel();
  void setWirelessNoiseLevel(float value);
}
