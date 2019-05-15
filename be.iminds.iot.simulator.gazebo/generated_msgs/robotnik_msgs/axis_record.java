package robotnik_msgs;

public interface axis_record extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/axis_record";
  static final java.lang.String _DEFINITION = "# \n# RECORD = 1, STOP = 2\nint8 action\n# DIRECTORY TO SAVE THE VIDEO\nstring directory\n# PROFILE TO USE DURING THE RECORDING\nstring profile\n# id / name of the recording\nstring id\n---\nbool ret\n";
}
