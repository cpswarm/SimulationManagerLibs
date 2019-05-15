package robot_localization;

public interface SetDatumRequest extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "robot_localization/SetDatumRequest";
  static final java.lang.String _DEFINITION = "geographic_msgs/GeoPose geo_pose\n";
  geographic_msgs.GeoPose getGeoPose();
  void setGeoPose(geographic_msgs.GeoPose value);
}
