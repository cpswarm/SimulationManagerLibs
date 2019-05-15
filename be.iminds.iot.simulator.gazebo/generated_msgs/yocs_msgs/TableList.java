package yocs_msgs;

public interface TableList extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "yocs_msgs/TableList";
  static final java.lang.String _DEFINITION = "# A list of tables\n\nTable[] tables\n";
  java.util.List<yocs_msgs.Table> getTables();
  void setTables(java.util.List<yocs_msgs.Table> value);
}
