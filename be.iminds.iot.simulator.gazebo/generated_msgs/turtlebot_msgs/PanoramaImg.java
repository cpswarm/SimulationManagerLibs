package turtlebot_msgs;

public interface PanoramaImg extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "turtlebot_msgs/PanoramaImg";
  static final java.lang.String _DEFINITION = "#Pano message\nHeader header\nstring pano_id\nfloat64 latitude\nfloat64 longitude\nfloat64 heading #in degrees, compass heading\nstring geo_tag\nsensor_msgs/Image image";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.lang.String getPanoId();
  void setPanoId(java.lang.String value);
  double getLatitude();
  void setLatitude(double value);
  double getLongitude();
  void setLongitude(double value);
  double getHeading();
  void setHeading(double value);
  java.lang.String getGeoTag();
  void setGeoTag(java.lang.String value);
  sensor_msgs.Image getImage();
  void setImage(sensor_msgs.Image value);
}
