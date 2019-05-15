package object_recognition_msgs;

public interface GetObjectInformationRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "object_recognition_msgs/GetObjectInformationRequest";
  static final java.lang.String _DEFINITION = "# Retrieve extra data from the DB for a given object\n\n# The type of the object to retrieve info from\nobject_recognition_msgs/ObjectType type\n\n";
  object_recognition_msgs.ObjectType getType();
  void setType(object_recognition_msgs.ObjectType value);
}
