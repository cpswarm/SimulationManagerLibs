package yocs_msgs;

public interface ColumnList extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/ColumnList";
  static final java.lang.String _DEFINITION = "# Virtual column obstacles\n\nColumn[] obstacles\n";
  java.util.List<yocs_msgs.Column> getObstacles();
  void setObstacles(java.util.List<yocs_msgs.Column> value);
}
