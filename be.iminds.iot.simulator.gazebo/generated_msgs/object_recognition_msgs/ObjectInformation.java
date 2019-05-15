package object_recognition_msgs;

public interface ObjectInformation extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "object_recognition_msgs/ObjectInformation";
  static final java.lang.String _DEFINITION = "############################################## VISUALIZATION INFO ######################################################\n################### THIS INFO SHOULD BE OBTAINED INDEPENDENTLY FROM THE CORE, LIKE IN AN RVIZ PLUGIN ###################\n\n# The human readable name of the object\nstring name\n\n# The full mesh of the object: this can be useful for display purposes, augmented reality ... but it can be big\n# Make sure the type is MESH\nshape_msgs/Mesh ground_truth_mesh\n\n# Sometimes, you only have a cloud in the DB\n# Make sure the type is POINTS\nsensor_msgs/PointCloud2 ground_truth_point_cloud\n";
  java.lang.String getName();
  void setName(java.lang.String value);
  shape_msgs.Mesh getGroundTruthMesh();
  void setGroundTruthMesh(shape_msgs.Mesh value);
  sensor_msgs.PointCloud2 getGroundTruthPointCloud();
  void setGroundTruthPointCloud(sensor_msgs.PointCloud2 value);
}
