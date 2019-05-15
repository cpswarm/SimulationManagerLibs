package object_recognition_msgs;

public interface TableArray extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "object_recognition_msgs/TableArray";
  static final java.lang.String _DEFINITION = "Header header\n\n# Just an array of tables\nobject_recognition_msgs/Table[] tables\n";
  std_msgs.Header getHeader();
  void setHeader(std_msgs.Header value);
  java.util.List<object_recognition_msgs.Table> getTables();
  void setTables(java.util.List<object_recognition_msgs.Table> value);
}
