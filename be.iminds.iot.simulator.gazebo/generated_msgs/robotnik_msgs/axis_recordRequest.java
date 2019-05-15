package robotnik_msgs;

public interface axis_recordRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/axis_recordRequest";
  static final java.lang.String _DEFINITION = "# \n# RECORD = 1, STOP = 2\nint8 action\n# DIRECTORY TO SAVE THE VIDEO\nstring directory\n# PROFILE TO USE DURING THE RECORDING\nstring profile\n# id / name of the recording\nstring id\n";
  byte getAction();
  void setAction(byte value);
  java.lang.String getDirectory();
  void setDirectory(java.lang.String value);
  java.lang.String getProfile();
  void setProfile(java.lang.String value);
  java.lang.String getId();
  void setId(java.lang.String value);
}
