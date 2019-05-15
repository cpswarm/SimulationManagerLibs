package nmea_msgs;

public interface Gpgga extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "nmea_msgs/Gpgga";
  static final java.lang.String _DEFINITION = "# Message from GPGGA NMEA String\nHeader header\n\nstring message_id\n\n# UTC seconds from midnight\nfloat64 utc_seconds\n\nfloat64 lat\nfloat64 lon\n\nstring lat_dir\nstring lon_dir\n\nuint32 gps_qual\n\nuint32 num_sats\nfloat32 hdop \nfloat32 alt\nstring altitude_units\n\nfloat32 undulation\nstring undulation_units\nuint32 diff_age\nstring station_id\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.lang.String getMessageId();
  void setMessageId(java.lang.String value);
  double getUtcSeconds();
  void setUtcSeconds(double value);
  double getLat();
  void setLat(double value);
  double getLon();
  void setLon(double value);
  java.lang.String getLatDir();
  void setLatDir(java.lang.String value);
  java.lang.String getLonDir();
  void setLonDir(java.lang.String value);
  int getGpsQual();
  void setGpsQual(int value);
  int getNumSats();
  void setNumSats(int value);
  float getHdop();
  void setHdop(float value);
  float getAlt();
  void setAlt(float value);
  java.lang.String getAltitudeUnits();
  void setAltitudeUnits(java.lang.String value);
  float getUndulation();
  void setUndulation(float value);
  java.lang.String getUndulationUnits();
  void setUndulationUnits(java.lang.String value);
  int getDiffAge();
  void setDiffAge(int value);
  java.lang.String getStationId();
  void setStationId(java.lang.String value);
}
