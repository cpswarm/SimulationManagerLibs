package robotnik_msgs;

public interface MotorStatus extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/MotorStatus";
  static final java.lang.String _DEFINITION = "string state\nstring status\nstring communicationstatus\nstring statusword\nstring driveflags\nstring[] activestatusword\nstring[] activedriveflags\nint32 digitaloutputs\nint32 digitalinputs\nfloat32 averagecurrent\nfloat32[] analoginputs\n\n";
  java.lang.String getState();
  void setState(java.lang.String value);
  java.lang.String getStatus();
  void setStatus(java.lang.String value);
  java.lang.String getCommunicationstatus();
  void setCommunicationstatus(java.lang.String value);
  java.lang.String getStatusword();
  void setStatusword(java.lang.String value);
  java.lang.String getDriveflags();
  void setDriveflags(java.lang.String value);
  java.util.List<java.lang.String> getActivestatusword();
  void setActivestatusword(java.util.List<java.lang.String> value);
  java.util.List<java.lang.String> getActivedriveflags();
  void setActivedriveflags(java.util.List<java.lang.String> value);
  int getDigitaloutputs();
  void setDigitaloutputs(int value);
  int getDigitalinputs();
  void setDigitalinputs(int value);
  float getAveragecurrent();
  void setAveragecurrent(float value);
  float[] getAnaloginputs();
  void setAnaloginputs(float[] value);
}
