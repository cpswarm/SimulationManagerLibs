package robotnik_msgs;

public interface Data extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/Data";
  static final java.lang.String _DEFINITION = "string interface\nfloat32 bytes_sent\nfloat32 bytes_received\nstring units_sent\nstring units_received\nint32 packages_sent\nint32 packages_received\n\n";
  java.lang.String getInterface();
  void setInterface(java.lang.String value);
  float getBytesSent();
  void setBytesSent(float value);
  float getBytesReceived();
  void setBytesReceived(float value);
  java.lang.String getUnitsSent();
  void setUnitsSent(java.lang.String value);
  java.lang.String getUnitsReceived();
  void setUnitsReceived(java.lang.String value);
  int getPackagesSent();
  void setPackagesSent(int value);
  int getPackagesReceived();
  void setPackagesReceived(int value);
}
