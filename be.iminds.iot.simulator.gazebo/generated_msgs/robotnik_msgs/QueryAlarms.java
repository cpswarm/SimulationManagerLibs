package robotnik_msgs;

public interface QueryAlarms extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/QueryAlarms";
  static final java.lang.String _DEFINITION = "string TYPE_QUERY_ALL=ALL\nstring TYPE_QUERY_TOP=TOP\nstring TYPE_BETWEEN_DATE=BETWEEN_DATE\nstring TYPE_TOP_BETWEEN_DATE=TOP_BETWEEN_DATE\nstring FILTER_TYPE_NOTHING=NOTHING\nstring FILTER_TYPE_EVENT=EVENT\nstring FILTER_TYPE_ALARM=ALARM\nstring FILTER_TYPE_ERROR=ERROR\nstring type_query\nstring start_date\nstring end_date\nint32 top\nstring filter_type\n---\nQueryAlarm[] alarms\nbool success\nstring msg\n";
}
