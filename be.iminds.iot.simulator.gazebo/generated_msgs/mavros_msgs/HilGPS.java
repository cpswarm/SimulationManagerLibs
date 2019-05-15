package mavros_msgs;

public interface HilGPS extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "mavros_msgs/HilGPS";
  static final java.lang.String _DEFINITION = "# HilControls.msg\n#\n# ROS representation of MAVLink HIL_GPS\n# See mavlink message documentation here:\n# https://pixhawk.ethz.ch/mavlink/#HIL_GPS\n\nstd_msgs/Header header\nuint8 fix_type\ngeographic_msgs/GeoPoint geo\nuint16 eph\nuint16 epv\nuint16 vel\nint16 vn\nint16 ve\nint16 vd\nuint16 cog\nuint8 satellites_visible\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  byte getFixType();
  void setFixType(byte value);
  geographic_msgs.GeoPoint getGeo();
  void setGeo(geographic_msgs.GeoPoint value);
  short getEph();
  void setEph(short value);
  short getEpv();
  void setEpv(short value);
  short getVel();
  void setVel(short value);
  short getVn();
  void setVn(short value);
  short getVe();
  void setVe(short value);
  short getVd();
  void setVd(short value);
  short getCog();
  void setCog(short value);
  byte getSatellitesVisible();
  void setSatellitesVisible(byte value);
}
