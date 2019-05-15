package multimaster_msgs_fkie;

public interface Capability extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "multimaster_msgs_fkie/Capability";
  static final java.lang.String _DEFINITION = "# the ROS namespace of the capability\nstring namespace\n# the name of the capability\nstring name\n# the type of the capability\nstring type\n# list of the images assigned to the this capability\nstring[] images\n# the description of the capability\nstring description\n# a list of nodes assigned to this group. The nodes are described by full ROS name (with namesspace)\nstring[] nodes ";
  java.lang.String getNamespace();
  void setNamespace(java.lang.String value);
  java.lang.String getName();
  void setName(java.lang.String value);
  java.lang.String getType();
  void setType(java.lang.String value);
  java.util.List<java.lang.String> getImages();
  void setImages(java.util.List<java.lang.String> value);
  java.lang.String getDescription();
  void setDescription(java.lang.String value);
  java.util.List<java.lang.String> getNodes();
  void setNodes(java.util.List<java.lang.String> value);
}
