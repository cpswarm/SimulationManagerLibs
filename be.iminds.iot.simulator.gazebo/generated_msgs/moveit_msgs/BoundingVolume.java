package moveit_msgs;

public interface BoundingVolume extends org.ros.internal.message.Message {
  static final java.lang.String _TYPE = "moveit_msgs/BoundingVolume";
  static final java.lang.String _DEFINITION = "# Define a volume in 3D\n\n# A set of solid geometric primitives that make up the volume to define (as a union)\nshape_msgs/SolidPrimitive[] primitives\n\n# The poses at which the primitives are located\ngeometry_msgs/Pose[] primitive_poses\n\n# In addition to primitives, meshes can be specified to add to the bounding volume (again, as union)\nshape_msgs/Mesh[] meshes\n\n# The poses at which the meshes are located\ngeometry_msgs/Pose[] mesh_poses\n";
  java.util.List<shape_msgs.SolidPrimitive> getPrimitives();
  void setPrimitives(java.util.List<shape_msgs.SolidPrimitive> value);
  java.util.List<geometry_msgs.Pose> getPrimitivePoses();
  void setPrimitivePoses(java.util.List<geometry_msgs.Pose> value);
  java.util.List<shape_msgs.Mesh> getMeshes();
  void setMeshes(java.util.List<shape_msgs.Mesh> value);
  java.util.List<geometry_msgs.Pose> getMeshPoses();
  void setMeshPoses(java.util.List<geometry_msgs.Pose> value);
}
