package multimaster_msgs_fkie;

public interface ListDescriptionResponse extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs_fkie/ListDescriptionResponse";
  static final java.lang.String _DEFINITION = "string robot_name\nstring robot_type\nstring[] robot_images\nstring robot_descr\nmultimaster_msgs_fkie/Capability[] capabilities ";
  java.lang.String getRobotName();
  void setRobotName(java.lang.String value);
  java.lang.String getRobotType();
  void setRobotType(java.lang.String value);
  java.util.List<java.lang.String> getRobotImages();
  void setRobotImages(java.util.List<java.lang.String> value);
  java.lang.String getRobotDescr();
  void setRobotDescr(java.lang.String value);
  java.util.List<multimaster_msgs_fkie.Capability> getCapabilities();
  void setCapabilities(java.util.List<multimaster_msgs_fkie.Capability> value);
}
