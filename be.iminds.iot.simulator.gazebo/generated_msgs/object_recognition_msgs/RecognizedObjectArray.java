package object_recognition_msgs;

public interface RecognizedObjectArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "object_recognition_msgs/RecognizedObjectArray";
  static final java.lang.String _DEFINITION = "##################################################### HEADER ###########################################################\nHeader header\n\n# This message type describes a potential scene configuration: a set of objects that can explain the scene\nobject_recognition_msgs/RecognizedObject[] objects\n\n##################################################### SEARCH ###########################################################\n\n# The co-occurrence matrix between the recognized objects\nfloat32[] cooccurrence\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<object_recognition_msgs.RecognizedObject> getObjects();
  void setObjects(java.util.List<object_recognition_msgs.RecognizedObject> value);
  float[] getCooccurrence();
  void setCooccurrence(float[] value);
}
