package robotnik_msgs;

public interface QueryAlarm extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robotnik_msgs/QueryAlarm";
  static final java.lang.String _DEFINITION = "int32 alm_id\nstring alm_component\nstring alm_type\nstring alm_group\nstring alm_description\nstring alm_start_time\nstring alm_end_time\n";
  int getAlmId();
  void setAlmId(int value);
  java.lang.String getAlmComponent();
  void setAlmComponent(java.lang.String value);
  java.lang.String getAlmType();
  void setAlmType(java.lang.String value);
  java.lang.String getAlmGroup();
  void setAlmGroup(java.lang.String value);
  java.lang.String getAlmDescription();
  void setAlmDescription(java.lang.String value);
  java.lang.String getAlmStartTime();
  void setAlmStartTime(java.lang.String value);
  java.lang.String getAlmEndTime();
  void setAlmEndTime(java.lang.String value);
}
