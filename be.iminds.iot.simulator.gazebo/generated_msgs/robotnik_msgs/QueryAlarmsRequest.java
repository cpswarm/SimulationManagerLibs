package robotnik_msgs;

public interface QueryAlarmsRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/QueryAlarmsRequest";
  static final java.lang.String _DEFINITION = "string TYPE_QUERY_ALL=ALL\nstring TYPE_QUERY_TOP=TOP\nstring TYPE_BETWEEN_DATE=BETWEEN_DATE\nstring TYPE_TOP_BETWEEN_DATE=TOP_BETWEEN_DATE\nstring FILTER_TYPE_NOTHING=NOTHING\nstring FILTER_TYPE_EVENT=EVENT\nstring FILTER_TYPE_ALARM=ALARM\nstring FILTER_TYPE_ERROR=ERROR\nstring type_query\nstring start_date\nstring end_date\nint32 top\nstring filter_type\n";
  static final java.lang.String TYPE_QUERY_ALL = "ALL";
  static final java.lang.String TYPE_QUERY_TOP = "TOP";
  static final java.lang.String TYPE_BETWEEN_DATE = "BETWEEN_DATE";
  static final java.lang.String TYPE_TOP_BETWEEN_DATE = "TOP_BETWEEN_DATE";
  static final java.lang.String FILTER_TYPE_NOTHING = "NOTHING";
  static final java.lang.String FILTER_TYPE_EVENT = "EVENT";
  static final java.lang.String FILTER_TYPE_ALARM = "ALARM";
  static final java.lang.String FILTER_TYPE_ERROR = "ERROR";
  java.lang.String getTypeQuery();
  void setTypeQuery(java.lang.String value);
  java.lang.String getStartDate();
  void setStartDate(java.lang.String value);
  java.lang.String getEndDate();
  void setEndDate(java.lang.String value);
  int getTop();
  void setTop(int value);
  java.lang.String getFilterType();
  void setFilterType(java.lang.String value);
}
