package kobuki_msgs;

public interface VersionInfo extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "kobuki_msgs/VersionInfo";
  static final java.lang.String _DEFINITION = "# Contains unique device id, version info and available features for the kobuki platform.\n# Useful for compatibility checking and introspection\n\nstring hardware   # <major>.<minor>.<patch>\nstring firmware   # <major>.<minor>.<patch>\nstring software   # Still to decide how it will look\nuint32[] udid\n\n# Bitmask that specifies the available features in the firmware and/or driver\nuint64 features\n\n# The following represent the bit fields corresponding to bits in the features value\n\n# Provided firmware kobuki_firmware_1.1.1.hex\nuint64 SMOOTH_MOVE_START    = 0000000000000001\nuint64 GYROSCOPE_3D_DATA    = 0000000000000002\n";
  static final long SMOOTH_MOVE_START = 1;
  static final long GYROSCOPE_3D_DATA = 2;
  java.lang.String getHardware();
  void setHardware(java.lang.String value);
  java.lang.String getFirmware();
  void setFirmware(java.lang.String value);
  java.lang.String getSoftware();
  void setSoftware(java.lang.String value);
  int[] getUdid();
  void setUdid(int[] value);
  long getFeatures();
  void setFeatures(long value);
}
