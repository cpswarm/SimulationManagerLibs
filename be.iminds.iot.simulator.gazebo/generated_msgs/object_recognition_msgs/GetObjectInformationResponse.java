package object_recognition_msgs;

public interface GetObjectInformationResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "object_recognition_msgs/GetObjectInformationResponse";
  static final java.lang.String _DEFINITION = "\n# Extra object info \nobject_recognition_msgs/ObjectInformation information";
  object_recognition_msgs.ObjectInformation getInformation();
  void setInformation(object_recognition_msgs.ObjectInformation value);
}
